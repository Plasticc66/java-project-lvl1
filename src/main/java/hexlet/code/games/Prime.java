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

            if (Prime.isPrime(number)) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        Engine.run(RULE, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {

        if (number == 1 || number == 0) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
