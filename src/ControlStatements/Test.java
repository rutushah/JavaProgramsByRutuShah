package ControlStatements;

import java.util.Scanner;

/**
 * To qualify a loan , a person must make at least $30,000 and working at their current job for atleast 2 years.
 * */
public class Test {
    public static void main(String[] args) {

        //available inputs
        double salary = 0;
        int experience = 0;

        //taking salary from user.
        System.out.println("Enter your salary : ");
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextDouble();

        //taking salary from user.
        System.out.println("Enter your job experience : ");
        experience = scanner.nextInt();

        if ((salary >= 30000) && (experience >= 2)){
            System.out.println("Congrats!!!, You are qualified to have a loan.");
        }else {
            System.out.println("Sorry!!!, you are not qualified for the loan.");
        }

    }
}
