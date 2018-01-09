package com.zipcode.transcurrency.Transcurrency.controllers;

import com.zipcode.transcurrency.Transcurrency.models.User;
import com.zipcode.transcurrency.Transcurrency.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(){}

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id:[0-9]+}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{name:[a-zA-Z]+}")
    public void deleteUser(@PathVariable("name") String name){
        userService.deleteUser(name);
    }

}
