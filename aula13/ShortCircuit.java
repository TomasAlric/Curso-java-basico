package com.tomas.aula13;

public class ShortCircuit {

    public static void main(String[] args) {

        boolean correct = true;
        boolean wrong = false;
        boolean result1 = wrong & correct;
        boolean result2 = wrong && correct;
        System.out.println(result1);
        System.out.println(result2);

        int result = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(result);

    }

}
