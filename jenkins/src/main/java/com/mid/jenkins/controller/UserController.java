package com.mid.jenkins.controller;

import com.mid.jenkins.entity.Users;
import com.mid.jenkins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Users> save(@RequestBody Users dataReq) {
        Users dataRes = userService.save(dataReq);
        return new ResponseEntity<Users>(dataRes, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Users> getById(@PathVariable("id") Long id) {
        Users dataRes = userService.getById(id);
        return new ResponseEntity<Users>(dataRes, HttpStatus.OK);
    }

}
