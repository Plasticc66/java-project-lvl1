package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String question;
    private static String rightAnswer;
    private static int temp;

    public static void playPrime() {

        final int rightBound = 98;
final int leftBound = 2;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                temp = Utils.getRandomInt(leftBound,rightBound);
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
