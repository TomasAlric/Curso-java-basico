package com.tomas.aula13;

public class LogicalOperators {
    public static void main(String[] args) {

        int value1 = 1;
        int value2 = 2;

        boolean result1 = (value1 == 1) && (value2 == 2);
        System.out.println("value 1 is 1 AND value 2 is 2 " + result1);

        boolean result2 = (value1 == 1) || (value2 == 2);
        System.out.println("value 1 is 1 AND value 2 is 2 " + result2);

        boolean correct = true;
        boolean wrong = false;

        System.out.println(correct && false);
        System.out.println(correct || false);
        System.out.println(correct ^ false);
        System.out.println(!correct && false);

    }
}
