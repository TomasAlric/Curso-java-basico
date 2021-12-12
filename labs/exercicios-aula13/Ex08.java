package com.tomas;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("***************");
        System.out.println("SALARY OF MONTH");
        System.out.println("***************");

        System.out.println("How much do you earn per hour? ");
        double valuePerHour = scan.nextDouble();

        System.out.println("How many hours do you work per month? ");
        double hoursPerMonth = scan.nextDouble();

        double salary = valuePerHour * hoursPerMonth;

        System.out.println("The salary is: " + salary);

    }
}
