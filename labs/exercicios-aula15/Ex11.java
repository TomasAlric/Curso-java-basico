import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        double salary = scan.nextDouble();

        int percentage = 0;

        if (salary <= 280) {
            percentage = 20;
        } else if (salary > 280 && salary < 700) {
            percentage = 15;
        } else if (salary >= 700 && salary < 1500) {
            percentage = 10;
        } else if (salary >= 1500) {
            percentage = 5;
        }

        double increase = (salary / 100) * percentage;
        double adjustedSalary = salary + increase;

        System.out.println("Salary: " + salary);
        System.out.println("Percentage: " + percentage);
        System.out.println("Adjusted salary: " + adjustedSalary);
    }
}