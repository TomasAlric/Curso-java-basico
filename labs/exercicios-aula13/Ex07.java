package com.tomas;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("DISCOVER THE AREA OF SQUARE");
        System.out.println("***************************");

        System.out.println("Enter the size of the side of the square: ");
        double side = scan.nextDouble();

        double area = Math.pow(side, 2);
        System.out.println("The area of the square is: " + area);
        System.out.println("Twice the area of the square is " + (area * 2));
    }
}
