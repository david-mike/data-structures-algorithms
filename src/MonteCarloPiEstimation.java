import java.util.Random;

public class MonteCarloPiEstimation {

    public double piEstimation(int iteration) {
        double pi = 0.0;
        double x = 0.0;
        double y = 0.0;
        int counter = 0;
        Random rand = new Random();
        int i = 0;
        while (i < iteration) {
            x = rand.nextDouble();
            y = rand.nextDouble();

            if (x * x + y * y < 1) {
                // if x * x + y * y < 1, it means the point is inside the circle
                counter++;
            }
            i++;
        }

        return (4.0 * counter) / iteration;
    }

    public static void main(String[] args) {
        System.out.println(new MonteCarloPiEstimation().piEstimation(299990000));
        // 3.1416197609880494
    }
}
