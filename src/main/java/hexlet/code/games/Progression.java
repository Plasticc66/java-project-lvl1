package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final String rule = "What number is missing in the progression?";

    public static void playProgression() {

        final int lengthArray = 10;
        String[] progressionLine = new String[lengthArray];
        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        final int rightBound = 21;
        final int stepRightBound = 9;
        final int stepLeftBound = 1;
        final int skipRightBound = 10;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            int step = Utils.getRandomInt(stepLeftBound, stepRightBound);
            int firstNum = Utils.getRandomInt(0, rightBound);

            progressionLine[0] = Integer.toString(firstNum);

            for (int j = 1; j < progressionLine.length; j++) {
                progressionLine[j] = Integer.toString(Integer.parseInt(progressionLine[j - 1]) + step);
            }

            int skip = Utils.getRandomInt(0, skipRightBound);
            String answer = progressionLine[skip];
            progressionLine[skip] = "..";

            StringBuilder question = new StringBuilder("\nQuestion: ");
            for (String s : progressionLine) {
                question.append(s).append(" ");
            }

            questionsAndAnswers[i][0] = question.toString();
            questionsAndAnswers[i][1] = answer;
        }

        Engine.run(rule, questionsAndAnswers);

    }
}
