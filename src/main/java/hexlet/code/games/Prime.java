package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        int number;
        final int rightBound = 101;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            number = Utils.getRandomInt(0, rightBound);
            String question = "\nQuestion: " + number;

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][0] = Prime.isPrime(number) ? "yes" : "no";
        }
        Engine.run(RULE, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number < 2 || number % i == 0) {
                return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
