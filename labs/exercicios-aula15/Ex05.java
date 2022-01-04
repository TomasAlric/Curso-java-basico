import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first note");
        double note1 = scan.nextDouble();

        System.out.println("Enter the second note");
        double note2 = scan.nextDouble();

        double average = (note1 + note2) / 2;

        if (average == 10) {
            System.out.println("Approved with distinction");
        } else if (average >= 7) {
            System.out.println("Approved");
        } else {
            System.out.println("Disapproved");
        }
    }
}