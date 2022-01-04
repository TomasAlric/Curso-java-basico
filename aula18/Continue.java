import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();

        System.out.println("Enter the limit: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {

            if (i % 7 == 0) {
                continue;
            }
            System.out.println("The value of i is: " + i);
        }
    }
}