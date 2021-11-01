package com.tomas.aula13;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 8;
        System.out.println(result);

        result = result % 7;
        System.out.println(result);

        String firstName = "This is a ";
        String secondName = "concatenated string";
        String thirdName = firstName + secondName;
        System.out.println(thirdName);

        result = result + 1;
        System.out.println(result);

        result++;
        System.out.println(result);

        //5
        System.out.println(result++);
        //same thing
        //System.out.println(result);
        //result = result + 1;
        //result +=1;

        System.out.println(++result);
        //same thing
        //result+=1;
        //System.out.println(result);

        result--;
        System.out.println(result);

        System.out.println(result--);
        System.out.println(--result);
    }
}
