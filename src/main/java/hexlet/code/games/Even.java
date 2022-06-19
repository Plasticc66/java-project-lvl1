package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";
    private static String question;
    private static boolean rightAnswer;
    private static int temp;

    public static void playEven() {

        final int rightBound = 20;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                temp = Utils.getRandomInt(0,rightBound);
                /*Engine even = new Engine(
                        getRightAnswer(),
                        getQuestion());
                even.playThisGame("StringType");*/
            }
        }

    }

    public static String getQuestion() {
        question = "\nQuestion: " + temp;
        return question;
    }

    private static boolean getRightAnswer() {
        if (temp % 2 == 0) {rightAnswer = true;}
        return rightAnswer;
    }

}
