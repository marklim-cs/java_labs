import java.util.ArrayList;

public class ThreeSort {
    static public void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        int min1 = Math.min(a, b);
        int min2 = Math.min(b, c);
        int min3 = Math.min(c, a);

        int middle = Math.max(Math.max(min1, min2), min3);

        System.out.printf("%d %d %d%n", min, middle, max);
    }
}
