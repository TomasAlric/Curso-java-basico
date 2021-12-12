package com.tomas;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("**************");
        System.out.println("SALARY AND DISCOUNTS");
        System.out.println("***************");

        System.out.println("How much do you earn per hour? ");
        double valuePerHour = scan.nextDouble();

        System.out.println("How many hours do you work per month? ");
        double hoursPerMonth = scan.nextDouble();

        double grossSalary = valuePerHour * hoursPerMonth;
        double inss = (grossSalary / 100) * 8;
        double syndicate = (grossSalary / 100) * 5;
        double ir = (grossSalary / 100 ) * 11;
        double totalDiscounts = inss + syndicate + ir;
        double netSalary = grossSalary - totalDiscounts;

        System.out.println("Gross Salary: R$ " + grossSalary);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Syndicate: R$ " + syndicate);
        System.out.println("IR: R$ " + ir);
        System.out.println("Total Discounts: R$ " + totalDiscounts);
        System.out.println("Net Salary: R$ " + netSalary);
    }
}