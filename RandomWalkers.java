/* randomStep
        0 = x + 1
        1 = x - 1
        2 = y + 1
        3 = y - 1
        */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int attemptInfo = Integer.parseInt(args[2]);

        int stepsPerAttempt = 0;
        int stepsTotal = 0;
        int attempts = 0;
        double average = 0.0;

        int x = 0;
        int y = 0;

        for (int i = 0; i < trials; i++) {

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

                stepsPerAttempt++;

            }

            if (attemptInfo == 1) {
                System.out.println(i + " step per attempt = " + stepsPerAttempt);
            }

            stepsTotal += stepsPerAttempt;

            x = 0;
            y = 0;
            stepsPerAttempt = 0;

        }

        average = (double) stepsTotal / trials;
        System.out.println("average number of steps = " + average);
        System.out.println("steps = " + stepsTotal);
    }
}
