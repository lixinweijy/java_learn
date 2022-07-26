package com.itheima.hello.ATM;

import java.util.Scanner;

public class Account {
    private String name;
    private String account;
    private String password;
    private double balance;
    private double max_change;

    public Account() {
    }

    public Account(String name, String account, String password, Double balance, Double max_change) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.balance = balance;
        this.max_change = max_change;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getMax_change() {
        return max_change;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setMax_change(Double max_change) {
        this.max_change = max_change;
    }
}
