package com.hnisc.serviceImpl;

import com.hnisc.dao.UserDao;
import com.hnisc.entity.User;
import com.hnisc.service.UserService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lh141
 */
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUser(Integer userId) {
        return userDao.getUser(userId);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
