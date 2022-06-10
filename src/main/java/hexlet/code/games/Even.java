package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";
    private static String question;
    private static String rightAnswer;
    private static int temp;

    public static void playEven() {


        Random random = new Random();
        final int randomBound = 20;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (Engine.itLose() == false) {

                temp = random.nextInt(randomBound);
                Engine even = new Engine(
                        getRightAnswer(),
                        getQuestion());
                even.playThisGame("StringType");
            }
        }

    }

    public static String getQuestion() {
        question = "\nQuestion: " + temp;
        return question;
    }

    public static String getRightAnswer() {
        if (temp % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }

}
