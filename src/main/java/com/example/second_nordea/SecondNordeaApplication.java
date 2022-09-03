package com.example.second_nordea;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class SecondNordeaApplication {
    private static Scanner input = new Scanner(System.in);
    private static double deposit_amount_John;
    public static void main(String[] args) {
        SpringApplication.run(SecondNordeaApplication.class, args);

        calculation calculation_First = new calculation();
        calculation_First.calculation_all();

    }

}
