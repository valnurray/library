package com.lankin.library.rest;

import com.lankin.library.entity.User;
import com.lankin.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//@RestController
//@RequestMapping(value = "/api/v1/admin/")
public class AdminRestController {

//    private final UserRepository userRepository;
//
//    @Autowired
//    public AdminRestController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @GetMapping(value = "users/{id}")
//    public ResponseEntity<AdminUserDto> getUserById(@PathVariable(name = "id") Long id) {
//        Optional<User> user = userRepository.findById(id);
//
//        if (user == null) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//
//        AdminUserDto result = AdminUserDto.fromUser(user);
//
//        return new ResponseEntity<>(result, HttpStatus.OK);
//    }
}
