package com.tomas;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first note: ");
        double note1 = scan.nextDouble();

        System.out.println("Enter the second note: ");
        double note2 = scan.nextDouble();

        System.out.println("Enter the third note: ");
        double note3 = scan.nextDouble();

        System.out.println("Enter the fourth note: ");
        double note4 = scan.nextDouble();

        double average = (note1 + note2 + note3 + note4) / 4;

        System.out.println("The average is: " + average);
    }
}