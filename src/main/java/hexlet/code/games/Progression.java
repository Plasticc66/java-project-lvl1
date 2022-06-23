package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final String rule = "What number is missing in the progression?";

    public static void playProgression() {

        final int lengthArray = 10;
        String[] progressionLine = new String[lengthArray];
        final int amountData = 6;
        String[][] questionsAndAnswers = new String[amountData][2];

        final int rightBound = 21;
        final int stepRightBound = 9;
        final int stepLeftBound = 1;
        final int skipRightBound = 10;

        for (int i = 0; i < amountData; i++) {

            int step = Utils.getRandomInt(stepLeftBound, stepRightBound);
            int firstNum = Utils.getRandomInt(0, rightBound);

            progressionLine[0] = Integer.toString(firstNum);

            for (int j = 1; j < progressionLine.length; j++) {
                progressionLine[j] = Integer.toString(Integer.parseInt(progressionLine[j - 1]) + step);
            }

            int skip = Utils.getRandomInt(0, skipRightBound);
            String answer = progressionLine[skip];
            progressionLine[skip] = "..";

            String question = "\nQuestion: ";
            for (int k = 0; k < progressionLine.length; k++) {
                question += progressionLine[k] + " ";
            }

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }

        Engine.run(rule, questionsAndAnswers);

    }
}
