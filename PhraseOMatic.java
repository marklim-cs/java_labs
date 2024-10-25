public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive",
                            "agent based", "functional", "AI enabled", "strongly typed"};
        String[] wordListTwo = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive",
                                "agent based", "functional", "AI enabled", "strongly typed"};
        String[] wordListThree = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive",
                                "agent based", "functional", "AI enabled", "strongly typed"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        java.util.Random randomGenerator = new java.util.Random();
        int random1 = randomGenerator.nextInt(oneLength);
        int random2 = randomGenerator.nextInt(twoLength);
        int random3 = randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[random1] + " " + wordListTwo[random2] + " " + wordListThree[random3];

        System.out.println("What we need is a " + phrase);
    }
}
