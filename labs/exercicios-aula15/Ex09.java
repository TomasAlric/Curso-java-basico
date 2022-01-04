import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first digit: ");
        int d1 = scan.nextInt();

        System.out.println("Enter the second digit: ");
        int d2 = scan.nextInt();

        System.out.println("Enter the third digit: ");
        int d3 = scan.nextInt();

        if (d1 <= d2 && d1 <= d3 && d2 <= d3) {
            System.out.println(d3 + " - " + d2 + " - " + d1);
        } else if (d1 <= d2 && d1 <= d3 && d3 <= d2) {
            System.out.println(d2 + " - " + d3 + " - " + d1);
        } else if (d2 <= d1 && d2 <= d3 && d1 <= d3) {
            System.out.println(d3 + " - " + d1 + " - " + d2);
        } else if (d2 <= d1 && d2 <= d3 && d3 <= d1) {
            System.out.println(d1 + " - " + d3 + " - " + d2);
        } else if (d3 <= d1 && d3 <= d2 && d1 <= d2) {
            System.out.println(d2 + " - " + d1 + " - " + d3);
        } else if (d3 <= d1 && d3 <= d2 && d2 <= d1) {
            System.out.println(d1 + " - " + d2 + " - " + d3);
        }
    }
}