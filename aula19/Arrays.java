public class Arrays {
    public static void main(String[] args) {

        double[] temperatures = new double[365];
        temperatures[0] = 31.3;
        temperatures[1] = 32;
        temperatures[2] = 33.7;
        temperatures[3] = 34;
        temperatures[4] = 33.1;

        System.out.println("The temperature value for day 1 is: " + temperatures[0]);

        System.out.println("The size of the array: " + temperatures.length);

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("The temperature value for day " + (i + 1) + " is: " + temperatures[i]);
        }
    }
}