package loops;

import java.util.Scanner;

/**
 * While loop
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime
 * */

public class WhileLoopExample {

    public static void main(String[] args) {

        // variable declaration
        int rate = 15;
        int maxHours = 40;


        // get input
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // validate input
        while (hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        // gross salary
        double salary = rate*hoursWorked;
        System.out.println(salary);


    }
}
