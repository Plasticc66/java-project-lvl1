package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String question;
    private static String rightAnswer;

    private static Random random = new Random();
    static final int RANDOM_BOUND = 98;
    private static int temp;

    public static void playPrime() {

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                temp = random.nextInt(RANDOM_BOUND) + 2;

                Engine prime = new Engine(
                        getRightAnswer(),
                        getQuestion());
                prime.playThisGame("StringType");
            }
        }

    }

    public static String getRightAnswer() {
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                rightAnswer = "no";
                break;
            } else {
                rightAnswer = "yes";
            }
        }
        return rightAnswer;
    }

    public static String getQuestion() {
        question = "\nQuestion: " + temp;
        return question;
    }

}
