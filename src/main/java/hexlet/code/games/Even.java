package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";

    public static void playEven() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        int number;
        final int rightBound = 20;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            number = Utils.getRandomInt(0, rightBound);

            questionsAndAnswers[i][0] = "\nQuestion: " + number;

            questionsAndAnswers[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.run(rule, questionsAndAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
