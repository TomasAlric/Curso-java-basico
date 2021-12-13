package com.tomas;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f-32) / 9);

        System.out.println("The temperature " + f + "°F is equal to " + c + "°C");
    }
}
