package com.example.second_nordea;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class John {

    private int id;
    private String firstName;
    private String lastName;
    private double initial_balance_John;
    private boolean account_status;

    private Address_John address;

    private String [] languages;

    public John(String firstName, String lastName, double initial_balance_John, boolean account_status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial_balance_John = initial_balance_John;
        this.account_status = account_status;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Address_John getAddress() {
        return address;
    }

    public void setAddress(Address_John address) {
        this.address = address;
    }

    public John() {
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

    public double getInitial_balance_John() {
        return initial_balance_John;
    }

    public void setInitial_balance_John(double initial_balance_John) {
        this.initial_balance_John = initial_balance_John;
    }

    public boolean isAccount_status() {
        return account_status;
    }

    public void setAccount_status(boolean account_status) {
        this.account_status = account_status;
    }
}
