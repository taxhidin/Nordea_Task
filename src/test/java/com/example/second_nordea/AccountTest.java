package com.example.second_nordea;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

class AccountTest {
    private ObjectMapper mapper = new ObjectMapper();
    private final John John_characteristics = mapper.readValue(new File("data/John_Detail.json"), John.class);

    private Account account_2 = new Account(John_characteristics.getInitial_balance_John());
    private Account account;
    private static int count;

    private static Scanner input = new Scanner(System.in);

    AccountTest() throws IOException {
    }

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account.testing_method("Alan", "Openheimer", 600, false);
        System.out.println("Running a test .....");
    }

    @Test
    void getBalance() throws Exception {

        double balance_test = 50.0;
        assertEquals("John  initial balance for testing valuie is correct", John_characteristics.getInitial_balance_John(), balance_test);

    }

    @Test
    void setBalance() {
    }

    @Test
    void credit() {
        System.out.println("If John  enter $60 deposit amount");
        double credit_calculated = account_2.getBalance() + 60;
        assertEquals("Final value after added deposit: ", 110, credit_calculated, 0);

    }
    //We are going to test the John information stored in our Json file


    @Test
    void testing_value_stored_json() {
        System.out.println("Expected last name: Rossi");
        String  expected_last_name = "Rossi";
        String actual_last_name = John_characteristics.getLastName();
        assertEquals("Testing John information stored in Json file ",expected_last_name,actual_last_name);

    }
}