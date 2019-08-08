package com.hnisc.web.action;

import com.hnisc.entity.User;
import com.hnisc.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;
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

    public String findAll(){
        List<User> list =userService.findAll();

        System.out.println(list.size());
        //压入值栈
        ActionContext.getContext().put("list", list);
        return SUCCESS;
    }
}
