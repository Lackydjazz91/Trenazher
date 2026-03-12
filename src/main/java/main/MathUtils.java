package main;

public class MathUtils {
    private MathUtils() {
    }

    public static double sumAll(Number... numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }

        return sum;
    }
}
