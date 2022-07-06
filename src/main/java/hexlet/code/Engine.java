package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int WIN_FOR_END = 3;

    public static void run(String rule, String[][] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("\nHello, " + name + "!");

        System.out.println(rule);
        final int roundsNum = 3;

        for (int i = 0; i < roundsNum; i++) {
            int j = 0;
            System.out.println(questionsAndAnswers[i][j]);
            String playerAnswer = scanner.nextLine();

            if (questionsAndAnswers[i][j + 1].equals(playerAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][j + 1]
                        + "'.\nLet's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
