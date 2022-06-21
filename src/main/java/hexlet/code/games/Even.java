package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void playEven() {

        String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";

        final int amountData = 6;
        String[] questionsAndAnswers = new String[amountData];

        int temp;
        final int rightBound = 100;

        for (int i = 0; i < amountData; i += 2) {

            temp = Utils.getRandomInt(0, rightBound);

            questionsAndAnswers[i] = "\nQuestion: " + temp;

            if (Even.isEven(temp)) {
                questionsAndAnswers[i + 1] = "yes";
            } else {
                questionsAndAnswers[i + 1] = "no";
            }
        }
        Engine.run(rule, questionsAndAnswers);
    }

    private static boolean isEven(int temp) {
        return temp % 2 == 0;
    }

}
