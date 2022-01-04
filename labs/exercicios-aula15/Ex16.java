import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value A: ");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Is not a second degree equation");
        } else {

            System.out.println("Enter the value B: ");
            int b = scan.nextInt();

            System.out.println("Enter the value C: ");
            int c = scan.nextInt();

            double delta = Math.pow(b, 2) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Negative delta");
            } else {
                System.out.println("Delta = " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}