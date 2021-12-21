public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("The value of i: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        int count = 0;
        for (; count < 10; ) {
            System.out.println("Value of count: " + count);
            count += 2;
        }

        for (int counter = 0; counter < 10; counter += 2) {
            System.out.println("Value of count: " + counter);
        }

        int sum = 0;
        for (int i = 1; i < 5; sum += i++) ;
        System.out.println("The value of sum is: " + sum);
    }
}