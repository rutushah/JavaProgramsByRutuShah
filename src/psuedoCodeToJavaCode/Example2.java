package psuedoCodeToJavaCode;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        //        1. integer n
        //        2. integer i
        //        3. integer flag = 0
        int n, i, flag = 0;

        //        4. read n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        n = scanner.nextInt();

        //        5. do for i = 2 to n-1
        //        6. if n % i == 0
        //        7. flag = 1;
        //        8. endif
        //        9. endfor
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }

        //        10. if flag == 0
        //        11. print "YES"
        //        12. else
        //        13. print "NO"
        //        14. endif
        if (flag == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



