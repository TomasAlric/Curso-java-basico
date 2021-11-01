import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        if(age > 18){
            System.out.println("Legal age");
        }
        else{
            System.out.println("Is not legal age");
        }

        //Price

        System.out.println("Enter the price of an item");
        double price = scan.nextDouble();

        if (price <= 10){
            System.out.println("Is cheap, can buy");
        }
        else if (price > 10 && price < 15){
            System.out.println("You can ask for a discount");
        }
        else if (price >=15 && price < 17){
            System.out.println("Can search more");
        }
        else{
            System.out.println("Very expensive");
        }
    }
}