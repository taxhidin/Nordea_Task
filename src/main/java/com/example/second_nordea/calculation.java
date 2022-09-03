package com.example.second_nordea;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class calculation {
    private static Scanner input = new Scanner(System.in);
    private static double deposit_amount_John;

    public static void calculation_all () {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Person John_characteristics = mapper.readValue(new File("data/John_Detail.json"), Person.class);
            Account account_1 = new Account(John_characteristics.getInitial_balance());

            System.out.println("Enter deposit amount for John: ");
            deposit_amount_John = input.nextDouble();
            input.nextLine();

            account_1.credit(deposit_amount_John);
            AddressPerson address_john = John_characteristics.getAddress();


            Person Bob_Characteristics = mapper.readValue(new File("data/Bob_Detail.json"), Person.class);
            Account account_2 = new Account(Bob_Characteristics.getInitial_balance());

            System.out.printf("%s", "Enter deposit amount for Bob: ");
            double depoist_amount_Bob = input.nextDouble();
            input.close();

            account_2.credit(depoist_amount_Bob);
            AddressPerson address_bob = Bob_Characteristics.getAddress();

            System.out.println("First name and last name: \n" + John_characteristics.getFirstName() + " " + John_characteristics.getLastName() + "\n");
            System.out.println("John id: \n" + John_characteristics.getId() + "\n");
            System.out.println("John account status: \n" + John_characteristics.isAccount_status() + "\n");
            System.out.println("John initial balance: \n" + John_characteristics.getInitial_balance() + "\n");
            System.out.printf("John address Street: %s, City: %s, State: %s, Zip: %d, Country: %s \n"
                    , address_john.getStreet()
                    , address_john.getCity()
                    , address_john.getState()
                    , address_john.getZip()
                    , address_john.getCountry());
            System.out.println("John languages: ");
            for (String Lang_John : John_characteristics.getLanguages()) {

                System.out.print(Lang_John + "  ");

            }
            System.out.println("\n");
            System.out.printf("John balance: $%.5f\n\n", account_1.getBalance());


            System.out.printf("First name and last name:\n%s %s\n", Bob_Characteristics.getFirstName(), Bob_Characteristics.getLastName());
            System.out.println("Bob id: \n" + Bob_Characteristics.getId() + "\n");
            System.out.println("Bob account status: \n" + Bob_Characteristics.isAccount_status() + "\n");
            System.out.println("Bob initial balance: \n" + Bob_Characteristics.getInitial_balance() + "\n");
            System.out.printf("Bob address Street: %s, City: %s, State: %s, Zip: %d, Country: %s \n"
                    , address_bob.getStreet()
                    , address_bob.getCity()
                    , address_bob.getState()
                    , address_bob.getZip()
                    , address_bob.getCountry());
            System.out.println("Bob languages: ");
            for (String Lang_Bob : Bob_Characteristics.getLanguages()) {
                System.out.printf("%s  ", Lang_Bob);
            }
            System.out.println("\n");
            System.out.printf("Bob balance: $%.5f\n", account_2.getBalance());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
