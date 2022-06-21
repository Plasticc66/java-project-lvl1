package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void playPrime() {

        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        final int amountData = 6;
        String[] questionsAndAnswers = new String[amountData];

        int temp;
        final int rightBound = 98;
        final int leftBound = 2;


        for (int i = 0; i < amountData; i += 2) {

            temp = Utils.getRandomInt(leftBound, rightBound);
            String question = "\nQuestion: " + temp;
            questionsAndAnswers[i] = question;

            String answer;
            if (Prime.isPrime(temp)) {
                questionsAndAnswers[i + 1] = "yes";
            } else if (!(Prime.isPrime(temp))) {
                questionsAndAnswers[i + 1] = "no";
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
