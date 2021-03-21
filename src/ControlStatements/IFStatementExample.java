package ControlStatements;

import java.util.Scanner;

public class IFStatementExample {

    public static void main(String[] args) {
        //scanner class is used to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :  ");
        int a = scanner.nextInt();

        //Checking whether a is greater than 10 or not.
        if (a>10){
            System.out.println("A is  greater than 10");// This code will only be executed if user enters value of a which is greater than 10.
        }

        //If value is not greater than 10 then, if block will not be executed and instead it will execute this default print statement mentioned below.
        System.out.println("Default print statement is executed.");
    }
}
