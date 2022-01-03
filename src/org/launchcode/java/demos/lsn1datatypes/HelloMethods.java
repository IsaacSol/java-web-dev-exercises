package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        java.util.Scanner input;
        System.out.println("Enter first two english letters of your language:");
        input = new java.util.Scanner(System.in);
        String msg = input.next();
        String message = Message.getMessage(msg);
        input.close();
        System.out.println(message);
    }

}
