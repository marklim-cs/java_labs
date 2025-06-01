public class RandomWalk {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;

        int x = 0;
        int y = 0;

        /* randomStep
        0 = x + 1
        1 = x - 1
        2 = y + 1
        3 = y - 1
        */

        System.out.println("(" + x + ", " + y + ")");

        while (Math.abs(x) + Math.abs(y) != r) {
            int randomStep = (int) (Math.random() * 4);

            if (randomStep == 0) {
                x++;
            } else if ( randomStep == 1) {
                x--;
            } else if (randomStep == 2) {
                y++;
            } else {
                y--;
            }

            steps++;

            System.out.println("(" + x + ", " + y + ")");

        }
        System.out.println("Number of steps = " + steps);
    }
}
