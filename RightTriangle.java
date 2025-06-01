public class RightTriangle {
    static public void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean answer = false;

        double sum = (a*a) + (b*b) + (c*c);
        double max2 = Math.pow(Math.max(Math.max(a, b), c), 2);


        if (a > 0 && b > 0 && c > 0) {
            answer = (max2 + max2 == sum);
        }
        System.out.println(answer);
    }
}

/*
The following two conditions are necessary and sufficient:
Each integer must be positive.
The sum of the squares of two of the integers must equal the square of the third integer.
 */