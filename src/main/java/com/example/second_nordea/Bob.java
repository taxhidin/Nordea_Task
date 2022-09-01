package com.example.second_nordea;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Bob {

    private int id;
    private String firstName;
    private String lastName;
    private double initial_balance_Bob;
    private boolean account_status;

    private Address_Bob address;

    private String [] languages;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Address_Bob getAddress() {
        return address;
    }

    public void setAddress(Address_Bob address) {
        this.address = address;
    }

    public Bob() {

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

    public double getInitial_balance_Bob() {
        return initial_balance_Bob;
    }

    public void setInitial_balance_Bob(double initial_balance_Bob) {
        this.initial_balance_Bob = initial_balance_Bob;
    }

    public boolean isAccount_status() {
        return account_status;
    }

    public void setAccount_status(boolean account_status) {
        this.account_status = account_status;
    }
}
