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
        this.model.setName(name);
    }

    public void setLastName(String lastName) {
        this.model.setLast_name(lastName);
    }

    public void setAccount_money(double account_money) {
        this.model.setAccount_money(account_money);
    }

    public void setHasATicket(boolean hasATicket) {
        this.model.setHasATicket(hasATicket);
    }

    public String getName() {
        return User.getName();
    }

    public String getLastName() {
        return this.model.getLast_name();
    }

    public double getAccount_money() {
        return this.model.getAccount_money();
    }

    public boolean getHasATicket() {
        return this.model.getHasATicket();
    }

    public void updateView() {
        this.view.UserDetails(User.getName(), this.model.getLast_name());
    }
}
