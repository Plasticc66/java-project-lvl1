package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int WIN_FOR_END = 3;
    private static int WIN_STREAK_FOR_CONGRATS = 0;
    private static boolean lose = false;
    public static boolean itLose() {
        return lose;
    }

    public static void run(String rule, String[][] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);
        String name = "NoName";
        System.out.println(rule);
        final int roundsNum = 3;

        //остановился тут, думал как правильно установить условия цикла,
        // потом надо будет понять как прописывать [][]

        for (int i = 0; i < roundsNum; i++) {
            int j = 0;
            if (!Engine.itLose()) {
                System.out.println(questionsAndAnswers[i][j]);
                String playerAnswer = scanner.nextLine();

                if (questionsAndAnswers[i][j + 1].equals(playerAnswer)) {
                    System.out.println("Correct!");
                    WIN_STREAK_FOR_CONGRATS++;
                } else {
                    System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '"
                            + questionsAndAnswers[i][j + 1]
                            + "'.\nLet's try again, " + name + "!");
                    lose = true;
                    //break;
                }
            }

            if (WIN_STREAK_FOR_CONGRATS == WIN_FOR_END) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }

}
