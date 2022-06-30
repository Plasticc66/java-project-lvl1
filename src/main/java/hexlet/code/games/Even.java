package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";

    public static void playEven() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        int num;
        final int rightBound = 20;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            num = Utils.getRandomInt(0, rightBound);

            questionsAndAnswers[i][0] = "\nQuestion: " + num;

            if (Even.isEven(num)) {
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
