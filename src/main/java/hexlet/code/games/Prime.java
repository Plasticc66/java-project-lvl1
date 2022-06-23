package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {

        final int amountData = 6;
        String[][] questionsAndAnswers = new String[amountData][2];

        int temp;
        final int rightBound = 98;
        final int leftBound = 2;


        for (int i = 0; i < amountData; i++) {

            temp = Utils.getRandomInt(leftBound, rightBound);
            String question = "\nQuestion: " + temp;
            questionsAndAnswers[i][0] = question;

            if (Prime.isPrime(temp)) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        Engine.run(rule, questionsAndAnswers);
    }

    private static boolean isPrime(int number) {

        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}
