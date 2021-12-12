package com.tomas;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("The temperature " + c + "°C is equal to " + f + "°F");
    }
}
