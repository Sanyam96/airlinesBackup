package com.nagarro.controllers;

import com.nagarro.models.User;
import com.nagarro.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    /*
    @RequestMapping(value = "/")
    public ModelAndView listEmployee(ModelAndView model) throws IOException {
        List<Employee> listEmployee = employeeService.getAllEmployees();
        model.addObject("listEmployee", listEmployee);
        model.setViewName("home");
        return model;
    }
     */

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView login() {
//        //command is a reserved request attribute name, now use <form> tag to show object data
//        return new ModelAndView("flightSearch", "command", new User1());
//    }
//
//
//    @RequestMapping("/flightSearch")
//    public ModelAndView showform() {
//        //command is a reserved request attribute name, now use <form> tag to show object data
//        return new ModelAndView("flightSearch", "command", new User1());
//    }
//
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView save(@ModelAttribute("user") User1 user) {
//        System.out.println("login: " + user.getUsername() + " " + user.getPassword());
//
//        AuthenticateUser authuser = new AuthenticateUser();
//        if (authuser.findUser(user)) {
//
//            return new ModelAndView("flightDetails", "command", new User1());
//        } else {
//            return new ModelAndView("redirect:/flightSearch");
//        }
//    }
}
