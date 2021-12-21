public class LoopWhile {
    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Counting until" + max);

        while (i <= max) {
            System.out.println("Value of i: " + i);
            i++;
        }

        System.out.println(i);

        do {
            i++;
            System.out.println("Value of i: " + i);
        } while (i < 13);

        System.out.println(i);
    }
}