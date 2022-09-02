package com.example.second_nordea;

public class Account {

    private static John john;

    private double balance;

    public static void testing_method(String first_name, String last_name, double initial_balance_John_a, boolean value) {

        john = new John(first_name, last_name, initial_balance_John_a, value);

    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double initial_balance) {

        if (initial_balance > 0.0) {

            balance = initial_balance;

        }

    }

    public void credit(double amount) {

        balance += amount;


    }
}
