import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float num = scan.nextFloat();

        if (num >= 0) {
            System.out.println("The number entered is positive");
        } else {
            System.out.println("The number entered is negative");
        }
    }
}