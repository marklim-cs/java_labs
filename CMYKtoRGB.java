public class CMYKtoRGB {
    public static void main( String[] args) {
        if (args.length != 4) {
            System.out.println("❗ Please provide exactly 4 arguments in this order: cyan magenta yellow black (values between 0.0 and 1.0)");
            return;
        }
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = 1-black;
        int red = (int) Math.round(255*white*(1-cyan));
        int green = (int) Math.round(255*white*(1-yellow));
        int blue = (int) Math.round(255*white*(1-magenta));


        System.out.printf("red = %d%ngreen = %d%nblue = %d%n", red, green, blue);
    }
}
