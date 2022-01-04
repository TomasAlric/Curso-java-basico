import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the meat type: ");
        System.out.println(" 1 - Flank steak");
        System.out.println(" 2 - Rump steak");
        System.out.println(" 3 - Tenderloin");

        int type = scan.nextInt();

        System.out.println("Enter the amount: [kg]");
        double amount = scan.nextDouble();

        double priceKg = 0;

        if (type == 1) {

            System.out.println(amount + "Kg - Flank steak");

            if (amount < 5) {
                priceKg = 4.9;
            } else {
                priceKg = 5.8;
            }
        } else if (type == 2) {

            System.out.println(amount + "Kg - Rump steak");

            if (amount < 5) {
                priceKg = 5.9;
            } else {
                priceKg = 6.8;
            }
        } else if (type == 3) {

            System.out.println(amount + "Kg -  Tenderloin");

            if (amount < 5) {
                priceKg = 6.9;
            } else {
                priceKg = 7.8;
            }
        }
        double total = amount * priceKg;
        System.out.println(amount + "Kg * " + priceKg + " = " + total);

        System.out.println("Purchase on the card? Type 1 for yes");
        int card = scan.nextInt();

        if (card == 1) {
            double discount = (total / 100) * 5;
            System.out.println(" Discount of: " + discount);
            System.out.println("Price to pay: " + (total - discount));
        } else {
            System.out.println("Price to pay: " + total);
        }
    }
}