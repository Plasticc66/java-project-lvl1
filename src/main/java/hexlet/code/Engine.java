package hexlet.code;
import java.util.Scanner;
public class Engine {

    public static void playThisGame(String rule, String question, int rightAnswer) {
        //GREET + NAME

        String name = "mc borow";

        //RULE
        System.out.println(rule);
        System.out.println(question);

        //DECLARATION OF VARIABLES
        Scanner scanner = new Scanner(System.in);
        int winstreak = 0;
        final int winForEnd = 3;

        //GAME LOGIC
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
