package com.ARS;

public class UserController {
    User model;
    UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public double getAccountMoney() {
        return model.getAccountMoney();
    }

    public void updateView() {
        view.UserDetails(User.getDefaultName(), model.getLast_name());
    }
}
