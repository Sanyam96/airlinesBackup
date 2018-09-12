package com.nagarro.dao;

import com.nagarro.models.User;

import java.util.List;

/**
 * @author Sanyam Goel created on 11/9/18
 */
public interface UserDao {

    public List<User> getAllUsers();
}
