package com.hnisc.web.action;

import com.hnisc.entity.User;
import com.hnisc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author lh141
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getUser(){
        user=userService.getUser(1);
        return SUCCESS;
    }
    public String saveUser(){
        userService.saveUser(user);
        return SUCCESS;
    }

}
