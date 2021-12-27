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

    public void updateView() {
        view.UserDetails(User.getDefaultName(), model.getLast_name());
    }
}
