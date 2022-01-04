import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float num1 = scan.nextFloat();

        System.out.println("Enter the second number: ");
        float num2 = scan.nextFloat();

        System.out.println("Enter the operation (+ - / *):  ");
        String operation = scan.next();

        double result = 0;
        boolean valid = true;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid operation");
                valid = false;
                break;
        }

        if (valid) {
            System.out.println("Result: " + result);

            if (result >= 0) {
                System.out.println("Positive result");
            } else {
                System.out.println("Negative result");
            }
            if (result % 2 == 0) {
                System.out.println("Even result");
            } else {
                System.out.println("Odd result");
            }
        }
    }
}