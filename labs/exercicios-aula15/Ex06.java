import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is bigger");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is bigger");
        } else if (num3 >= num1 && num3 > num2) {
            System.out.println("num3 is bigger");
        }
    }
}