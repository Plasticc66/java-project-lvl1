package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String RULE = "Find the greatest common divisor of given numbers.";

    private static final int LEFT_BOUND = 2;
    private static final int RIGHT_BOUND = 98;

    public static void playGCD() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        int number1;
        int number2;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            number1 = Utils.getRandomInt(LEFT_BOUND, RIGHT_BOUND);
            number2 = Utils.getRandomInt(LEFT_BOUND, RIGHT_BOUND);

            questionsAndAnswers[i][0] = "\nQuestion: " + number1 + " " + number2;
            questionsAndAnswers[i][1] = String.valueOf(GCD.gcd(number1, number2));
        }

        Engine.run(RULE, questionsAndAnswers);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
