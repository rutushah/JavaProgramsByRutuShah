package ControlStatements;

import java.util.Scanner;

public class GradeCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your test score : ");
        int score = scanner.nextInt();

        char grade;

        if (score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade ='C';
        }else if (score >=60 ){
            grade ='D';
        }else {
            grade = 'F';
        }

        System.out.println("Your grade is " +grade);
    }
}
