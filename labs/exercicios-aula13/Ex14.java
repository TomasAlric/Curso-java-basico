package com.tomas;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter file size: ");
        double sizeArchive = scan.nextDouble();

        System.out.println("Enter internet speed: ");
        double speedInternet = scan.nextDouble();

        double time = sizeArchive / speedInternet;

        System.out.println("Time of download is: " + time);
    }
}