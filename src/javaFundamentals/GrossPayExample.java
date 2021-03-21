package javaFundamentals;

import java.util.Scanner;

public class GrossPayExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of hours employee worked : ");
        int hours = scanner.nextInt();

        System.out.println("Enter the hourly pay rate : ");
        double payRate = scanner.nextDouble();

        double grossSalary = hours * payRate;

        System.out.println("Your Gross pay rate is $" + grossSalary);

        // no of hours the employee worked
        // hourly payrate
    }
}
