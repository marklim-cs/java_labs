public class Main {
    public static void main(String[] args) {
        String name;
        name = "John";
        name = "Kate";
        // keyword final makes the variable unchangeable
        final int year = 2025, lastYear = 2024;
        final float price = 2.57f;
        boolean yes = true;
        char myChar = 66;
        /*
        %s - as a placeholder for a string,
        %n - new line, %d - integers,
        %f - float and double,
        %.f - number of decimals
        */
        System.out.printf("Hello, world! I'm %s! It's %d! It was %d earlier. Bread price is %.2f$. Yes, this is %b :(%n", name, year, lastYear, price, yes);
        System.out.print("I'm printing ->");
        System.out.printf(" on a new line! A letter %s.%n", myChar);
        System.out.println(3+3);
    }
        }