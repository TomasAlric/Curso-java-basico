import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side one: ");
        int side1 = scan.nextInt();

        System.out.println("Enter the side two: ");
        int side2 = scan.nextInt();

        System.out.println("Enter the side three: ");
        int side3 = scan.nextInt();

        if (((side1 + side2) > side3) ||
                ((side1 + side3) > side2) ||
                ((side2 + side3) > side1)) {

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 != side2 && side1 != side3 && side3 != side2) {
                System.out.println("Scalene triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles triangle");
            }
        } else {
            System.out.println("Does not form a triangle");
        }
    }
}