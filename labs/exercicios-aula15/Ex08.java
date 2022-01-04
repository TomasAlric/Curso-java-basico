import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first price: ");
        double price1 = scan.nextDouble();

        System.out.println("Enter the second price: ");
        double price2 = scan.nextDouble();

        System.out.println("Enter the third price: ");
        double price3 = scan.nextDouble();

        if (price1 <= price2 && price1 <= price3) {
            System.out.println("Buy product 1");
        } else if (price2 <= price1 && price2 <= price3) {
            System.out.println("Buy product 2");
        } else if (price3 <= price1 && price3 <= price2) {
            System.out.println("Buy product 3");
        }
    }
}