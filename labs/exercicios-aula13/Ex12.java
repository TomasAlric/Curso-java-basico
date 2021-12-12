package com.tomas;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your height: ");
        double height = scan.nextDouble();

        double idealHeight = (72.7 * height) - 58;

        System.out.println("The ideal height is: " + idealHeight);
    }
}
