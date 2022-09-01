package com.example.second_nordea;

public class Account {



    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double initial_balance){

        if (initial_balance >0.0){

            balance = initial_balance;

        }

    }

    public void credit (double amount){

        balance  +=amount;


    }
}
