package com.tomas.aula12;

import java.util.Scanner;

public class KeyboardDataReading {

    public static void main(String[] args) {

       //Complete
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String completeName = scan.nextLine();

        System.out.println("Your complete name is " + completeName);

        //First
        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        //Age
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is " + age);

        //Height
        System.out.println("Enter your height: ");
        double height = scan.nextDouble();
        System.out.println("Your age is " + age);

        System.out.println("Enter your first name, age, height, number of child, have a pet");
        String firstName1 = scan.next();
        int age1 = scan.nextInt();
        double height1 = scan.nextDouble();
        byte nChild = scan.nextByte();
        boolean havePet = scan.nextBoolean();

        System.out.println("Your first name is " + firstName1);
        System.out.println("Your age is " + age1);
        System.out.println("Your height is " + height1);
        System.out.println("Your number of child is " + nChild);
        System.out.println("Have a pet? " + havePet);

    }
}
