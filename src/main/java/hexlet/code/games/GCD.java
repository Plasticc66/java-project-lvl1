package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void playGCD() {

        String rule = "Find the greatest common divisor of given numbers.";

        final int amountData = 6;
        String[][] questionsAndAnswers = new String[amountData][2];

        final int leftBound = 2;
        final int rightBound = 98;
        int temp1;
        int temp2;

        for (int i = 0; i < amountData; i++) {
            do {
                temp1 = Utils.getRandomInt(leftBound, rightBound);
                temp2 = Utils.getRandomInt(leftBound, rightBound);
            }
            while (GCD.gcd(temp1, temp2) == 1 || temp1 == temp2);

            questionsAndAnswers[i][0] = "\nQuestion: " + temp1 + " " + temp2;
            questionsAndAnswers[i][1] = String.valueOf(GCD.gcd(temp1, temp2));
        }

        Engine.run(rule, questionsAndAnswers);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
