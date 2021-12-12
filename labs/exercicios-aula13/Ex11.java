package com.tomas;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the integer number: ");
        int num1 = scan.nextInt();

        System.out.println(("Enter another integer number: "));
        int num2 = scan.nextInt();

        System.out.println("Enter the real number");
        double num3 = scan.nextDouble();

        int result1 = (num1 * 2) * (num2 / 2);
        double result2 = (num1 * 3) + num3;
        double result3 = Math.pow(num3, 3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
