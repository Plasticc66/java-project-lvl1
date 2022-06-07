package hexlet.code.updGames;

public class GDCnew {

    public static String rule = "Find the greatest common divisor of given numbers.";
    public static String question;
    public static int rightAnswer;

    public static void playGDC() {
        Cli.greeting();
        String name = Cli.name;
    }

    public static int getRightAnswer() {
        return rightAnswer;
    }

    public static String getQuestion() {
        return question;
    }
}
