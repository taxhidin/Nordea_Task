package com.example.second_nordea;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

class AccountTest {
    private ObjectMapper mapper = new ObjectMapper();
    private final Person john = mapper.readValue(new File("data/John_Detail.json"), Person.class);

    private Account account_John = new Account(john.getInitial_balance());




    private final Person bob = mapper.readValue(new File("data/Bob_Detail.json"), Person.class);

    private Account account_bob = new Account(bob.getInitial_balance());



    private static int count;


    AccountTest() throws IOException {
    }

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account_John.getBalance();
        account_bob.getBalance();
        System.out.println("Running a test .....");
    }

    @Test
    void getBalance_John() throws Exception {

        double balance_test = 50.0;
        assertEquals("John  initial balance for testing valuie is correct", john.getInitial_balance(), balance_test);

    }

    @Test
    void getBalance_Bob() throws Exception {

        double balance_test = 1000.0;
        assertEquals("Bob  initial balance for testing valuie is correct", bob.getInitial_balance(), balance_test);

    }

    @Test
    void setBalance() {
    }

    @Test
    void credit_John() {
        System.out.println("If John  enter $60 deposit amount");
        double credit_calculated = account_John.getBalance() + 60;
        assertEquals("John's Final value after added deposit: ", 110, credit_calculated, 0);

    }

    @Test
    void credit_Bob() {
        System.out.println("If Bob  enter $60 deposit amount");
        double credit_calculated = account_bob.getBalance() + 60;
        assertEquals("Bob's Final value after added deposit: ", 1060, credit_calculated, 0);

    }


    @Test
    void testing_value_stored_json_John() {
        System.out.println("Expected last name: Rossi");
        String  expected_last_name = "Rossi";
        String actual_last_name = john.getLastName();
        assertEquals("Testing John information stored in Json file ",expected_last_name,actual_last_name);

    }

    @Test
    void testing_value_stored_json_Bob() {
        System.out.println("Expected last name: Oppenheimer");
        String  expected_last_name = "Oppenheimer";
        String actual_last_name = bob.getLastName();
        assertEquals("Testing Bob information stored in Json file ",expected_last_name,actual_last_name);

    }
}