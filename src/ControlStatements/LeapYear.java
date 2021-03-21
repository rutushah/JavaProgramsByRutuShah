package ControlStatements;

import java.util.Scanner;

/**
 * In this example we will check whether the entered num is leap year or not.
 * */

public class LeapYear {

    public static void main(String[] args) {
        //scanner class is used to take input from user during execution
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year to check whether the year is leap year or not : ");
        int year = scanner.nextInt();

        //logic for leap year
        if ((year %4 ==0) && (year %100 !=0) || (year % 400 ==0)){
            System.out.println(year + " is leap year.");
        }else {
            System.out.println(year + " is not leap year.");
        }

    }
}
