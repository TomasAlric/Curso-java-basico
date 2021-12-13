package com.tomas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("DISCOVER THE CIRCLE AREA");
        System.out.println("************************");

        System.out.println("Enter your radius of circle: ");
        double radius = scan.nextFloat();

        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area is: " + area);
    }
}
