package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;

public class GCD {

    private static String rule = "Find the greatest common divisor of given numbers.";
    private static String question;
    private static int rightAnswer = 1;

    private static int temp1;
    private static int temp2;

    public static void playGCD() {
        final int leftBound = 2;
        final int rightBound = 98;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {
                while (rightAnswer == 1) {
                    do {
                        temp1 = Utils.getRandomInt(leftBound, rightBound);
                        temp2 = Utils.getRandomInt(leftBound, rightBound);
                    }
                    while (temp1 == temp2);
                    gcd(temp1,temp2);
                }

                Engine gcd = new Engine(
                        rightAnswer,
                        getQuestion());

                gcd.playThisGame();
                rightAnswer = 1;

            }
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    public static String getQuestion() {
        question = "\nQuestion: " + temp1 + " " + temp2;
        return question;
    }

}
