package com.hnisc.dao;

import com.hnisc.entity.User;

import java.util.List;

/**
 * @author lh141
 */
public interface UserDao {

    List<User> findAll();
}
