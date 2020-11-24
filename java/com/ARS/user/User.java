
package com.ARS.user;

public class User {
    private static String name = "Bob";
    private String last_name;
    private double account_money = (double)((int)(Math.random() * 1000.0D));
    private boolean hasATicket;

    public static String getName() {
        return name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public double getAccount_money() {
        return this.account_money;
    }

    public boolean getHasATicket() {
        return this.hasATicket;
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

    public void setHasATicket(boolean hasATicket) {
        this.hasATicket = hasATicket;
    }
}
