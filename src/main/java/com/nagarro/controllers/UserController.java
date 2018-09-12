package com.nagarro.controllers;

import com.nagarro.interfaces.UserService;
import com.nagarro.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/get-user", method = RequestMethod.GET)
    public ModelAndView getAllUser(ModelAndView modelAndView) throws IOException {
        List<User> userList = userService.getAllUsers();
        modelAndView.addObject("listUsers", userList);
        modelAndView.setViewName("userPage");
        return modelAndView;
    }
}
