package com.hnisc.serviceImpl;

import com.hnisc.dao.UserDao;
import com.hnisc.entity.User;
import com.hnisc.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lh141
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
