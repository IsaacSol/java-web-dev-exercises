package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's the length in cm?");
        double length = input.nextDouble();
        System.out.println("What's the width in cm?");
        double width = input.nextDouble();
        input.close();
        System.out.println("The area is " + width * length + " cm²");
    }
}
