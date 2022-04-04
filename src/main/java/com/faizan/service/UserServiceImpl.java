package com.faizan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faizan.dto.UserRequestDTO;
import com.faizan.entity.Address;
import com.faizan.entity.User;
import com.faizan.exception.BadRequestException;
import com.faizan.repository.AddressRepository;
import com.faizan.repository.UserRepository;
import com.faizan.util.Helper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    AddressRepository addressRepo;

    @Override
    public void addUser(UserRequestDTO userDto) {
        // regex //
        // Helper.isValidRequest(user);
        final boolean flag = userRepo.existsByEmail(userDto.getEmail());
        if (flag) {
            throw new BadRequestException("email already in use");
        }

        final Address address = Address.builder().state(userDto.getState()).city(userDto.getCity()).build();
        final User userobj = User.builder().name(userDto.getName()).password(userDto.getPassword()).email(userDto.getEmail()).contactNumber(userDto.getContactNumber()).address(address).build();
        address.setUser(userobj);
        // addressRepo.save(address);
        userRepo.save(userobj);

    }

    @Override
    public void loginUser(String name, String passowrd) {
        Helper.isNameAndPasswordNullOrEmapty(name, passowrd);
        final boolean findByNameAndPassword = userRepo.existsByNameAndPassword(name, passowrd);
        if (findByNameAndPassword == false) {
            throw new BadRequestException("name or password is incorrect");

        }
    }

    @Override
    public Optional<User> getUser(Long userId) {
        final Optional<User> user = userRepo.findById(userId);
        return user;
    }

}
