package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {

    private static String rule = "What number is missing in the progression?";
    private static String question;
    private static int rightAnswer;


    private static Random random = new Random();
    static final int LENGTH_ARRAY = 10;
    private static String[] progressionLine = new String[LENGTH_ARRAY];

    public static void playProgression() {

        final int randomBound = 21;
        final int stepBound = 9;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                int step = random.nextInt(stepBound) + 1;
                int firstNum = random.nextInt(randomBound);

                progressionLine[0] = Integer.toString(firstNum);
                for (int i = 1; i < progressionLine.length; i++) {
                    progressionLine[i] = Integer.toString(Integer.parseInt(progressionLine[i - 1]) + step);
                }

                Engine progression = new Engine(
                        getRightAnswer(),
                        getQuestion());

                progression.playThisGame();
            }
        }
    }


    public static int getRightAnswer() {

        final int skipBound = 10;
        int skip = random.nextInt(skipBound);
        rightAnswer = Integer.parseInt(progressionLine[skip]);
        progressionLine[skip] = "..";

        return rightAnswer;
    }

    public static String getQuestion() {

        question = "\nQuestion: ";
        for (int i = 0; i < progressionLine.length; i++) {
            question += progressionLine[i] + " ";
        }

        return question;
    }
}
