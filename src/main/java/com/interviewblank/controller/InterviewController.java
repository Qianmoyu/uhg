package com.interviewblank.controller;

import com.interviewblank.pojo.UserDTO;
import com.interviewblank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/provider/saveProvider
 *
 * { "provider" :
 *      { "firstName": "",
 *        "lastName: "",
 *        "middleName: "",
 *        "dob": "",
 *        "degree" : ""
 *      }
 * }
 */

@RestController
@RequestMapping("/provider")
public class InterviewController {

    private final UserService userService;

    @Autowired
    public InterviewController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/saveProvider")
    public ResponseEntity<?> insertUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(userService.save(userDTO), HttpStatus.CREATED);
    }
}
