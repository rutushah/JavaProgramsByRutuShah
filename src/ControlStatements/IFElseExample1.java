package ControlStatements;

import java.util.Scanner;

/**
 * In this example we will check whether the number entered by user is positive or negative.
 * */

public class IFElseExample1 {

    public static void main(String[] args) {
        //scanner class is used to take input from user during execution
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check whether that number is positive or not : ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }

}
