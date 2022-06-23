package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";

    public static void playEven() {

        final int amountData = 6;
        String[][] questionsAndAnswers = new String[amountData][2];

        int temp;
        final int rightBound = 20;

        for (int i = 0; i < amountData; i++) {

            temp = Utils.getRandomInt(0, rightBound);

            questionsAndAnswers[i][0] = "\nQuestion: " + temp;

            if (Even.isEven(temp)) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        Engine.run(rule, questionsAndAnswers);
    }

    private static boolean isEven(int temp) {
        return temp % 2 == 0;
    }

}
