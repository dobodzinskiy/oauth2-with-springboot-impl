package com.dobodzinskiy.oauth2withspringbootimpl.controller;

import com.dobodzinskiy.oauth2withspringbootimpl.persist.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    //TODO ...
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public User viewProfile(@RequestParam String userId) {
        return new User();
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void editProfile(@RequestBody User user) {
    }

}
