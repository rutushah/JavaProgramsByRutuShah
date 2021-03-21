package javaFundamentals;

public class MultiDimensionalArray {

    /**
     * row and column
     * int a[10][20];
     * */

    public static void main(String[] args) {
        String fruits[][] = {
                {"1","2","3","4"},
                {"Apple","Banana","Kiwi","Orange"}
        };

        System.out.println(fruits[0][0] + "." + fruits[1][0]);
        System.out.println(fruits[0][1] + "." + fruits[1][1]);
        System.out.println(fruits[0][2] + "." + fruits[1][2]);
        System.out.println(fruits[0][3] + "." + fruits[1][3]);


        //source array
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        //declaring a destination array
        char[] copyTo = new char[7];

        //copying array using System.arraycopy() method

        System.arraycopy(copyFrom, 2, copyTo, 0, 7); //caffein
        //printing the destination array
        System.out.println(String.valueOf(copyTo));
    }

    //String
    //Collections
}
