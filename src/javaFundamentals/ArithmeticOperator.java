package javaFundamentals;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        a = scanner.nextInt();

        System.out.println("Value of a : " +a);

        System.out.println("Enter value of b : ");
        b = scanner.nextInt();

        System.out.println("Value of b : " +b);

//        System.out.println("Addition of two numbers is : " + (a+b));
//        System.out.println("Subtraction of two numbers is : " + (a-b));
//        System.out.println("Multiplication of two numbers is : " + (a*b));
//        System.out.println("Division of two numbers is : " + (b/a));
//        System.out.println("Module of two numbers is : " + (b%a));
//        System.out.println(++a + "Increment");
//        System.out.println(--a + "Decrement");

        //Comparison Operators
        System.out.println("A is equal B : " + (a==b));
        System.out.println("A is not equal B : " + (a!=b));
        System.out.println("A is greater then B : " + (a>b));
        System.out.println("A is less then B : " + (a<b));
        System.out.println("A is greater then or equal to B : " + (a>=b));
        System.out.println("A is less then or equal to B : " + (a<=b)); // true


    }
}
