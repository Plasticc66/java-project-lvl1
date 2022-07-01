package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final String RULE = "What number is missing in the progression?";

    public static void playProgression() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        final int firstNumberRightBound = 21;
        final int stepRightBound = 9;
        final int stepLeftBound = 1;
        final int skipRightBound = 10;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            int step = Utils.getRandomInt(stepLeftBound, stepRightBound);
            int firstNumber = Utils.getRandomInt(0, firstNumberRightBound);

            final int lengthArray = 10;
            String[] progression = Progression.makeProgression(firstNumber, step, lengthArray);

            int skip = Utils.getRandomInt(0, skipRightBound);
            String answer = progression[skip];
            progression[skip] = "..";

            String question = String.join(" ", progression);
            question = "Question:" + question;
            questionsAndAnswers[i][0] = question;

            questionsAndAnswers[i][1] = answer;
        }

        Engine.run(RULE, questionsAndAnswers);

    }


    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];
        progression[0] = Integer.toString(first);

        for (int i = 1; i < length; i++) {
            progression[i] = Integer.toString(Integer.parseInt(progression[i - 1]) + step);
        }
        return progression;
    }
}
