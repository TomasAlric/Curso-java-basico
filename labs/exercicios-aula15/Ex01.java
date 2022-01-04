import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("The highest number was the first: " + num1);
        } else {
            System.out.println("the highest number was the second: " + num2);
        }
    }
}
