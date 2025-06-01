import java.util.ArrayList;

public class UniformRandomNumbers {
    public static void main(String[] args)
    {
        ArrayList<Double> numbers = new ArrayList<>();
        double sum = 0.0;
        int n = 5;
        for (int i = 0; i < n; i++ ) {
            double random = Math.random();
            numbers.add(random);
            sum += random;
        }
        double average = sum / n;

        double min = numbers.get(0);
        double max = numbers.get(0);

        for (double num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.printf("random numbers = " + numbers);
        System.out.printf(" Average = %.2f, Min = %.2f, Max = %.2f", average, min, max);
    }

}
