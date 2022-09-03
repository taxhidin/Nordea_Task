package com.example.second_nordea;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {


    private int id;
    private String firstName;
    private String lastName;
    private double initial_balance;
    private boolean account_status;

    private AddressPerson address;

    private String [] languages;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, double initial_balance, boolean account_status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial_balance = initial_balance;
        this.account_status = account_status;
    }

    public Person(int id, String firstName, String lastName, double initial_balance, boolean account_status, AddressPerson address, String[] languages) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial_balance = initial_balance;
        this.account_status = account_status;
        this.address = address;
        this.languages = languages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getInitial_balance() {
        return initial_balance;
    }

    public void setInitial_balance(double initial_balance) {
        this.initial_balance = initial_balance;
    }

    public boolean isAccount_status() {
        return account_status;
    }

    public void setAccount_status(boolean account_status) {
        this.account_status = account_status;
    }

    public AddressPerson getAddress() {
        return address;
    }

    public void setAddress(AddressPerson address) {
        this.address = address;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
