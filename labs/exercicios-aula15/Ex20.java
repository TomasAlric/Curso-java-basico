import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Did you call the victim? [Y or N]");
        String answer1 = scan.next();

        System.out.println("Were you at the crime scene? [Y or N]");
        String answer2 = scan.next();

        System.out.println("Do you live close to the victim? [Y or N]");
        String answer3 = scan.next();

        System.out.println("Have you ever worked with the victim? [Y or N]");
        String answer4 = scan.next();

        System.out.println("Did you owe the victim money?");
        String answer5 = scan.next();

        int cont = 0;

        if (answer1.equalsIgnoreCase("Y")) {
            cont++;
        }
        if (answer2.equalsIgnoreCase("Y")) {
            cont++;
        }
        if (answer3.equalsIgnoreCase("Y")) {
            cont++;
        }
        if (answer4.equalsIgnoreCase("Y")) {
            cont++;
        }
        if (answer5.equalsIgnoreCase("Y")) {
            cont++;
        }
        if (cont == 2) {
            System.out.println("Suspicion");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Accomplice");
        } else if (cont == 5) {
            System.out.println("Murderer");
        } else if (cont == 0) {
            System.out.println("Innocent");
        }
    }
}