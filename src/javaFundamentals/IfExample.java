package javaFundamentals;

public class IfExample {
    public static void main(String[] args) {
        // even odd
//        int num = 15;
//        if (num%2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//
//        int year = 2021;
//        if ((year%4==0) && (year%100 != 0) || (year%400==0)){
//            System.out.println("Leap Year");
//        }else {
//            System.out.println("Not a leap year");
//        }

        int score = 75;
        char grade;

        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else  if (score >= 70){
            grade = 'c';
        }else if (score >= 60){
            grade = 'D';
        }else {
            grade = 'F';
        }

        System.out.println("Grade is : " + grade);

    }
}
