package hexlet.code;

import java.util.Scanner;

public class EngineNew {

    private static final int WIN_FOR_END = 3;
    public static int getWinForEnd() {
        return WIN_FOR_END;
    }
    private static int winStreakForCongrats = 0;
    public static int getWinStreakForCongrats() {
        return winStreakForCongrats;
    }
    private static int WIN_STREAK_FOR_CONGRATS = 0;
    private static boolean lose = false;
    public static boolean itLose() {
        return lose;
    }

    public static void run(String rule, String[] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);
        String name = "NoName";
        System.out.println(rule);

        for (int i = 0; i < questionsAndAnswers.length; i=+2){
            System.out.println(questionsAndAnswers[i]);
            String playerAnswer = scanner.nextLine();

            if (questionsAndAnswers[i + 1].equals(playerAnswer)) {
                System.out.println("Correct!");
                WIN_STREAK_FOR_CONGRATS++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i+1]
                        + "'.\nLet's try again, " + "NONAME" + "!");
                lose = true;
            }

            if (WIN_STREAK_FOR_CONGRATS == WIN_FOR_END) {
                System.out.println("Congratulations, " + "NONAME" + "!");
            }
        }
    }
}
