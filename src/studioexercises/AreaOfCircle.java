package studioexercises;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        boolean notEntered = true;
        while (notEntered) {
            input = new Scanner(System.in);
            System.out.println("Enter the radius of your circle:");
            try {
//                System.out.println(input);
                double radius = input.nextDouble();
                double areaOfCircle = Circle.getArea(radius);

                if( radius < 0) {
                    Exception err = new InputMismatchException("Err no negative numbers!");
                    System.err.println(err);
                } else {
                    notEntered = false;
//                    System.out.println(input);
                    System.out.println("The area of your circle with a radius of " + radius + " is: " + areaOfCircle);
                }
            } catch(Exception e) {
                System.err.println(e);
            }
        }
        input.close();
        System.out.println("The end!");


    }

}
