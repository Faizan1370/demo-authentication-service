package com.faizan.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faizan.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    boolean existsByEmail(String email);

    boolean existsByNameAndPassword(String name, String passowrd);

    Optional<User> findByEmail(String email);

}
