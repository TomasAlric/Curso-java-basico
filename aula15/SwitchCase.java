package com.tomas;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Enter one day of the week (1-7)");

        int dayWeek = scan.nextInt();

        if (dayWeek == 1){
            System.out.println("Sunday");
        }
        else if (dayWeek ==2){
            System.out.println("Monday");
        }
        else if (dayWeek ==3){
            System.out.println("Tuesday");
        }
        else if (dayWeek ==4){
            System.out.println("Wednesday");
        }
        else if (dayWeek ==5){
            System.out.println("Thursday");
        }
        else if (dayWeek ==6){
            System.out.println("Friday");
        }
        else if (dayWeek ==7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Is not a valid day");
        }
        */
        System.out.println("Enter one day of the week (1-7)");

        int dayWeek = scan.nextInt();

        switch(dayWeek){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday");  break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Is not a valid day");
        }
    }
}