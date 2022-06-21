package com.ARS.user;

public class User {
    private static String defaultName = "Bob";
    private String lastName;
    private double accountMoney = ((int) (Math.random() * 100));

    public static String getDefaultName() {
        return defaultName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getAccountMoney() {
        return this.accountMoney;
    }

    public void setName(String name) {
        User.defaultName = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }
}
