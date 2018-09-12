package com.nagarro.interfaces;

import com.nagarro.models.User;

import java.util.List;

/**
 * interfaces to retrieve all users from database
 * @author Sanyam Goel created on 11/9/18
 */
public interface UserService {

    public List<User> getAllUsers();
}
