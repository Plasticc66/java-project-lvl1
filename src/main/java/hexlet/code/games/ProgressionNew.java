package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.EngineNew;
import hexlet.code.Utils;

public class ProgressionNew {

    private static String rule = "What number is missing in the progression?";

    public static void playProgression() {
        final int lengthArray = 10;
        String[] progressionLine = new String[lengthArray];
        final int amountData = 2;
        String[] questionsAndAnswers = new String[amountData];

        final int rightBound = 21;
        final int stepRightBound = 9;
        final int stepLeftBound = 1;
        final int skipRightBound = 10;


        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                int step = Utils.getRandomInt(stepLeftBound, stepRightBound);
                int firstNum = Utils.getRandomInt(0, rightBound);

                progressionLine[0] = Integer.toString(firstNum);
                for (int i = 1; i < progressionLine.length; i++) {
                    progressionLine[i] = Integer.toString(Integer.parseInt(progressionLine[i - 1]) + step);
                }

                int skip = Utils.getRandomInt(0, skipRightBound);
                String answer = progressionLine[skip];
                progressionLine[skip] = "..";

                String question = "\nQuestion: ";
                for (int i = 0; i < progressionLine.length; i++) {
                    question += progressionLine[i] + " ";
                }

                questionsAndAnswers[0] = question;
                questionsAndAnswers[1] = answer;

                EngineNew.run(rule, questionsAndAnswers);
            }
        }
    }
}