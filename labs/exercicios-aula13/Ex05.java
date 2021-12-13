package com.tomas;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Conversion from meters to centimeters");

        System.out.println("Enter the amount of meters: ");
        double meter = scan.nextDouble();

        System.out.println("In centimeters is: " + (meter*100));
    }
}
