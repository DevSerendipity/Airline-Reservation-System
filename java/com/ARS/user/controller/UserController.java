package com.ARS.user.controller;

import com.ARS.user.User;
import com.ARS.user.view.UserView;

public class UserController {
    User model;
    UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setLastName(String lastName) {
        model.setLast_name(lastName);
    }

    public void setAccount_money(double account_money) {
        model.setAccount_money(account_money);
    }

    public String getName() {
        return User.getName();
    }

    public String getLastName() {
        return model.getLast_name();
    }

    public double getAccount_money() {
        return model.getAccount_money();
    }

    public void updateView() {
        view.UserDetails(User.getName(), model.getLast_name());
    }
}
