package com.ARS.user;

public class User {
    private static String defaultName = "Bob";
    private String last_name;
    private double accountMoney = ((int) (Math.random() * 100));

    public static String getDefaultName() {
        return defaultName;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public double getAccountMoney() {
        return this.accountMoney;
    }

    public void setName(String name) {
        User.defaultName = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }
}
