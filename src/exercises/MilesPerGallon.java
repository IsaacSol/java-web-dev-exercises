package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gallons = input.nextDouble();
        input.close();
        System.out.println("Your miles per gallon are " + miles / gallons);
    }
}
