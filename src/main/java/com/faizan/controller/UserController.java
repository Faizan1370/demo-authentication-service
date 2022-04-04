package com.faizan.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.faizan.dto.UserRequestDTO;
import com.faizan.entity.Address;
import com.faizan.entity.User;
import com.faizan.exception.BadRequestException;
import com.faizan.helper.EmailService;
import com.faizan.repository.AddressRepository;
import com.faizan.service.UserService;

@RestController
@RequestMapping("/user/service")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    RestTemplate rest;

    @Autowired
    AddressRepository addressRepo;

    // @RequestMapping(value= "/hi",method = RequestMethod.GET)
    @GetMapping("/hi")
    public String sayHi() {
        logger.info("hello log file");
        return "Hello buddy";
    }

    @GetMapping("/image")
    public Path sendURL() {
        final byte[] forObject = rest.getForObject("https://frontstream-dev-donateform.s3.us-east-2.amazonaws.com/00095d67-179b-46cd-90e9-886f37b7bf82.jpeg", byte[].class);

        try {
            /*
             * final FileOutputStream fo = new FileOutputStream("D:\\Spring-Boot\\image.jpg"); fo.write(forObject);
             */

            // Files.write(Paths.get("image.jpg"), forObject);
            return Files.write(Paths.get("D:\\Spring-Boot\\image.jpg"), forObject);
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return Paths.get("D:\\Spring-Boot\\image.jpg");
    }

    @PostMapping("/add/user")
    public ResponseEntity<?> addUser(@RequestBody @Valid UserRequestDTO userDto) {
        System.out.println("******************");
        userService.addUser(userDto);
        return ResponseEntity.ok("User added to db with name " + userDto.getName()); // error ke liye seedhe exception karo ek package bna exception krke || usme ek class bna AuthException
        // fir main batata

    }

    @PostMapping("/login/user")
    public ResponseEntity<?> loginUser(@RequestParam String name, @RequestParam String password) {
        System.out.println("name :" + name);
        System.out.println("password :" + password);
        userService.loginUser(name, password);
        return ResponseEntity.ok("You have succcefully logged in");

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long userId) {
        final Optional<User> user = userService.getUser(userId);
        if (!user.isPresent()) {
            throw new BadRequestException("no such user details found for id :" + userId);
        }
        return ResponseEntity.ok(user);

    }

    @GetMapping("/address/{id}")
    public ResponseEntity<?> getUserByCityName(@PathVariable("id") Long id) {
        final Optional<Address> userwithadd = addressRepo.findById(id);
        if (!userwithadd.isPresent()) {
            throw new BadRequestException("no such user details found for email :" + id);
        }
        return ResponseEntity.ok(userwithadd);

    }

    @GetMapping("/sendMail")
    public ResponseEntity<?> sendMail() {
        System.out.println("inside email service");
        final boolean sendEmail = EmailService.sendEmail();
        // final boolean sendAttach = EmailService.sendAttach();
        if (sendEmail) {
            return ResponseEntity.ok("send successfully");
        } else {
            return ResponseEntity.ok("sommethig went wrong");
        }

    }

}
