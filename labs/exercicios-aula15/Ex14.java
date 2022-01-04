import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first note: ");
        double note1 = scan.nextDouble();

        System.out.println("Enter the second note: ");
        double note2 = scan.nextDouble();

        double average = (note1 + note2) / 2;

        String enjoyment = "";

        if (average >= 9 && average <= 10) {
            enjoyment = "A";
        } else if (average >= 7.5 && average < 9) {
            enjoyment = "B";
        } else if (average >= 6 && average < 7.5) {
            enjoyment = "C";
        } else if (average >= 4 && average < 6) {
            enjoyment = "D";
        } else if (average >= 0 && average < 4) {
            enjoyment = "E";
        }

        System.out.println("note 1: " + note1);
        System.out.println("note 2: " + note2);
        System.out.println("Average:" + average);
        System.out.println("Enjoyment: " + enjoyment);

        switch (enjoyment) {
            case "A":
            case "B":
            case "C":
                System.out.println("Approved");
                break;
            case "D":
            case "E":
                System.out.println("Disapproved");
                break;
        }
    }
}