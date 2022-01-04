import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you earn per hour: ");
        double ValuePerHour = scan.nextDouble();

        System.out.println("How many hours do you work per month? ");
        double hoursPerMonth = scan.nextDouble();

        double grossSalary = ValuePerHour * hoursPerMonth;

        int percentageIR = 0;

        if (grossSalary <= 900) {
            percentageIR = 0;
        } else if (grossSalary > 900 && grossSalary <= 1500) {
            percentageIR = 5;
        } else if (grossSalary > 1500 && grossSalary <= 2500) {
            percentageIR = 10;
        } else if (grossSalary > 2500) {
            percentageIR = 20;
        }

        double ir = (grossSalary / 100) * percentageIR;
        double inss = (grossSalary / 100) * 10;
        double fgts = (grossSalary / 100) * 11;
        double totalDiscounts = ir + inss;
        double netSalary = grossSalary - totalDiscounts;

        System.out.println("Gross salary : (" + ValuePerHour + " * " + hoursPerMonth + "): " + grossSalary);
        System.out.println("(-) IR (" + 5 + "%) : " + ir);
        System.out.println("(-) INSS (10%): " + inss);
        System.out.println("FGTS (11%): " + fgts);
        System.out.println("Total discounts: " + totalDiscounts);
        System.out.println("Net salary: " + netSalary);
    }
}