package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    public String getRule() {
        String rule = null;
        return rule;
    }

    public final void playThisGame() {
        //GREET + NAME
        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May i have your name?");
        String name = hexlet.code.Cli.name();
        System.out.println("Hello, " + name);

        //RULE
        System.out.println(getRule());

        //DECLARATION OF VARIABLES
        Scanner scanner = new Scanner(System.in);
        int winstreak = 0;
        final int winForEnd = 3;

        //GAME LOGIC
        while (winstreak < winForEnd) {

            //YOU CONDITION
            String rightAnswer = condition();
            //YOU CONDITION

            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();
            if (playerAnswer.equals(rightAnswer)) {
                winstreak++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + name);
                break;
            }
        }
        if (winstreak == winForEnd) {
            System.out.println("Congratulations, " + name + "!");
        }
    }


    public String condition() {
        return null;
    }
}
