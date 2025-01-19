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

        int x = 5, y = 40;
        String upperName = name.toUpperCase();
        String txt = "Please, specify the index where 'index' has occurred";

        int myAge = 19, drivingAge = 18;

        if (myAge >= drivingAge) {
            System.out.printf("Your age is %s. You are allowed to drive. \n", myAge);
        }
        else {
            System.out.printf("Your age is %s. You are not allowed to drive", myAge);
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        /*
        %s - as a placeholder for a string,
        %n - new line,
        %d - integers,
        %f - float and double,
        %.f - number of decimals
        */
        System.out.printf("Hello, world! I'm %s! It's %d! It was %d earlier. Bread price is %.2f$. Yes, this is %b :(%n", name, year, lastYear, price, yes);
        System.out.print("I'm printing ->");
        System.out.printf(" on a new line! A letter %s.%n", myChar);
        System.out.println(3+3);
        System.out.println(x > 0 || y < 0);
        System.out.printf("The length of the name is %d and this isn't a lot %n", name.length());
        System.out.println(name.toUpperCase());
        System.out.println(upperName.toLowerCase());
        System.out.println(txt.indexOf("index"));
        System.out.println(name + " " + upperName);
        System.out.println(name.concat(upperName));
    }
        }