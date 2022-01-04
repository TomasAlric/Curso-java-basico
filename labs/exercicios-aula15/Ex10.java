import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the shift you study: ");
        String shift = scan.next();

        switch (shift) {
            case "m":
            case "M":
                System.out.println("Good morning");
                break;
            case "v":
            case "V":
                System.out.println("Good afternoon");
                break;
            case "n":
            case "N":
                System.out.println("Good night");
                break;
            default:
                System.out.println("Invalid value");
        }
    }
}