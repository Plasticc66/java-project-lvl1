package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void playProgression() {

        String rule = "What number is missing in the progression?";

        //объявление переменных и констант
        final int lengthArray = 10;
        String[] progressionLine = new String[lengthArray];
        final int amountData = 6;
        String[][] questionsAndAnswers = new String[amountData][2];

        final int rightBound = 21;
        final int stepRightBound = 9;
        final int stepLeftBound = 1;
        final int skipRightBound = 10;

        //вычисление массива вопросов и ответов
        for (int i = 0; i < amountData; i += 2) {

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

        //вызов движка
        Engine.run(rule, questionsAndAnswers);

    }
}
