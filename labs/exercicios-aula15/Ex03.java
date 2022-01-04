import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter (F or M): ");
        String letter = scan.nextLine();

        if (letter.equalsIgnoreCase("f")) {
            System.out.println("F - female");
        } else if (letter.equalsIgnoreCase("m")) {
            System.out.println("M - male");
        } else {
            System.out.println("Invalid sex");
        }
    }
}