import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of strawberries: [kg]");
        double amountStrawberries = scan.nextDouble();

        System.out.println("Enter the amount of apples: [kg]");
        double amountApples = scan.nextDouble();

        double priceKgStrawberrie = 0;
        if (amountStrawberries <= 5) {
            priceKgStrawberrie = 2.5;
        } else {
            priceKgStrawberrie = 2.2;
        }

        double priceKgApple = 0;

        if (priceKgApple <= 5) {
            priceKgApple = 1.8;
        } else {
            priceKgApple = 1.5;
        }

        double strawberryFullPrice = amountStrawberries * priceKgStrawberrie;
        double appleFullPrice = amountApples * priceKgApple;

        double partialPrice = priceKgStrawberrie + priceKgApple;
        double totalPrice = partialPrice;

        if ((amountStrawberries + amountApples > 8) || partialPrice > 25) {
            totalPrice = partialPrice - ((partialPrice / 100) * 10);
        }

        System.out.println("Total price = " + totalPrice);
    }
}