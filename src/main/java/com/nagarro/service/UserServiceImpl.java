package com.nagarro.service;

import com.nagarro.dao.UserDao;
import com.nagarro.interfaces.UserService;
import com.nagarro.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author Sanyam Goel created on 11/9/18
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
