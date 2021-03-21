package javaFundamentals;

public class NarrowCasting {
    public static void main(String[] args) {
        double a = 100.67;
        int b ;

        b = (int) a;

        System.out.println("Value of double datatype : " + a);
        System.out.println("Double datatype is now typecasted to int datatype : " +  b);
    }
}
