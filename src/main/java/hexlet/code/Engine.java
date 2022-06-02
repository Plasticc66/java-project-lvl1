package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static String rule;
    public static String question;
    public static int rightAnswer;

    public Engine(String rule, String question, int rightAnswer) {
        this.rule = rule;
        this.question = question;
        this.rightAnswer = rightAnswer;
    }

    public static void playThisGame() {
        //GREET + NAME

        String name = "mc borow";

        //RULE + QUESTION
        System.out.println(rule);
        System.out.println(question);

        //DECLARATION OF VARIABLES
        Scanner scanner = new Scanner(System.in);
        int winstreak = 0;
        final int winForEnd = 3;

        //WIN-LOSE LOGIC
        while (winstreak < winForEnd) {

            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equals(rightAnswer)) {
                winstreak++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + name + "!");
                break;
            }
        }
        if (winstreak == winForEnd) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
