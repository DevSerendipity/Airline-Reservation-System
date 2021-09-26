package com.ARS.user;

public class User {
    private static String name = "Bob";
    private String last_name;
    private double account_money = ((int)(Math.random() * 100.0D));

    public static String getName() {
        return name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public double getAccount_money() {
        return this.account_money;
    }

    public void setName(String name) {
        User.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setAccount_money(double account_money) {
        this.account_money = account_money;
    }
}
