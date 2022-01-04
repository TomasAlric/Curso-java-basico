import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first n1: ");
        int n1 = scan.nextInt();

        System.out.println("Enter the second n2: ");
        int n2 = scan.nextInt();

        System.out.println("Enter the third n3: ");
        int n3 = scan.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("n1 is bigger");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("n2 is bigger");
        } else if (n3 >= n1 && n3 > n2) {
            System.out.println("n3 is bigger");
        }

        if (n1 <= n2 && n1 <= n3) {
            System.out.println("n1 is smaller");
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println("n2 is smaller");
        } else if (n3 <= n1 && n3 <= n2) {
            System.out.println("n3 is smaller");
        }
    }
}