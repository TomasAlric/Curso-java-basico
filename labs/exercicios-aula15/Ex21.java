import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter with the amount of liters sold: ");
        double liters = scan.nextDouble();

        System.out.println("Enter the type of fuel: [A or F]");
        String type = scan.next();

        double fuelPrice = 2.5;
        double alcoholPrice = 1.9;
        double total = 0;
        double totalDiscount = 0;
        int discountPercentage = 0;

        if (type.equalsIgnoreCase("a")) {
            if (liters <= 20) {
                discountPercentage = 3;
            } else {
                discountPercentage = 5;
            }

            total = liters * alcoholPrice;
        } else if (type.equalsIgnoreCase("f")) {
            if (liters <= 20) {
                discountPercentage = 4;
            } else {
                discountPercentage = 6;
            }

            total = liters * fuelPrice;
        }

        totalDiscount = (total / 100) * discountPercentage;

        double priceToPay = total - totalDiscount;

        System.out.println("Price to pay: " + priceToPay);
    }
}