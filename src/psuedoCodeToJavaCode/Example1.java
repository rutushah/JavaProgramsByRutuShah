package psuedoCodeToJavaCode;

import java.util.Scanner;

/**
 * repeat 3 times
 * // read input
 *
 * prompt user
 * read height, length and width
 *
 * perform calculations
 *
 * //calculate surface area
 * surface area = 2 * ((height * width) + (width * length) + (height * length))
 *
 *
 * //calculate volume
 * volume = height * width * length
 *
 * // output results
 * output surface area
 * output volume
 *
 * //output whether or not cube.
 *
 * if (width, height and length are all equal)
 * output This is cube
 * else
 * output "This is not cube"
 * end if
 * end repeat }
 * }
 * */

public class Example1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height, width, length = 0;
        int surfaceArea, volume;

        for(int i =1; i<= 3; i++){

            //prompt user
            System.out.println("Enter 3 values for height, length and width");

            //read user values
            height = scanner.nextInt();
            length = scanner.nextInt();
            width = scanner.nextInt();

            //calculate surface area
            surfaceArea = 2 * ((height * width) + (width * length) + (height * length));

            //calculate volume
            volume = height * width * length;

            // output results
            System.out.println("Surface Area = " + surfaceArea);
            System.out.println("Volume = " + volume);

            if ((width == length) && (width == height)){
                System.out.println("This is cube");
            }else {
                System.out.println("This is not cube");
            }

        }

    }


}
