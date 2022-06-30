package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String rule = "Find the greatest common divisor of given numbers.";

    public static void playGCD() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        final int leftBound = 2;
        final int rightBound = 98;
        int num1;
        int num2;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {
            do {
                num1 = Utils.getRandomInt(leftBound, rightBound);
                num2 = Utils.getRandomInt(leftBound, rightBound);
            }
            while (GCD.gcd(num1, num2) == 1 || num1 == num2);

            questionsAndAnswers[i][0] = "\nQuestion: " + num1 + " " + num2;
            questionsAndAnswers[i][1] = String.valueOf(GCD.gcd(num1, num2));
        }

        Engine.run(rule, questionsAndAnswers);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
