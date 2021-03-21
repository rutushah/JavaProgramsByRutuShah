package javaFundamentals;

public class ArrayExample {

    public static void main(String[] args) {

        int a[] = new int[10];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        a[5] = 60;
        a[6] = 70;
        a[7] = 80;
        a[8] = 90;
        a[9] = 100;

        int arraySize = a.length;
        System.out.println("Array size"+ arraySize);

        String colors[] = {"black","blue","green","red","yellow"};


//        System.out.println("Value of array at index position 0 is : " +a[0]);
//        System.out.println("Value of array at index position 1 is : " +a[1]);
//        System.out.println("Value of array at index position 2 is : " +a[2]);
//        System.out.println("Value of array at index position 3 is : " +a[3]);
//        System.out.println("Value of array at index position 4 is : " +a[4]);
//        System.out.println("Value of array at index position 5 is : " +a[5]);

        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for (int j = 0; j<colors.length; j++){
            System.out.println(colors[j]);
        }
    }
}
