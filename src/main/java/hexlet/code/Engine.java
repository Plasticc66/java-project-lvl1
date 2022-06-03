package hexlet.code;
import hexlet.code.games.Calc;

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

    public static boolean playThisGame() {
        //GREET + NAME

        String name = "mc borow";

        //RULE
        System.out.println(rule);

        //DECLARATION OF VARIABLES
        Scanner scanner = new Scanner(System.in);
        final int winForEnd = 3;
        boolean result = false;

        //WIN-LOSE LOGIC
        for (int i=0; i < winForEnd; i++) {
            System.out.println(question);
            System.out.print("Your answer: ");
            int playerAnswer = scanner.nextInt();
            if (playerAnswer == rightAnswer) {
                System.out.println("Correct!");
                result = true;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + name + "!");
                break;
            }
            if (i == winForEnd-1) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
        return result;

    }
}
