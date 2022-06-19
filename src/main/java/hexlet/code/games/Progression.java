package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    /*Вопросы и ответы записывать в один двумерный массив,
    сделать его локальным , а не полем класса.*/

    private static String rule = "What number is missing in the progression?";
    private static String question;
    private static int rightAnswer;


    public static void playProgression() {

        final int lengthArray = 10;
        String[] progressionLine = new String[lengthArray];

        final int rightBound = 21;
        final int stepRightBound = 9;
final int stepLeftBound = 1;
        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                int step = Utils.getRandomInt(stepLeftBound,stepRightBound);
                int firstNum = Utils.getRandomInt(0,rightBound);

                progressionLine[0] = Integer.toString(firstNum);
                for (int i = 1; i < progressionLine.length; i++) {
                    progressionLine[i] = Integer.toString(Integer.parseInt(progressionLine[i - 1]) + step);
                }

                Engine progression = new Engine(
                        getRightAnswer(),
                        getQuestion());

                progression.playThisGame();
            }
        }
    }


    public static int getRightAnswer() {

        final int skipRightBound = 10;
        int skip = Utils.getRandomInt(0,skipRightBound);
        /*rightAnswer = Integer.parseInt(progressionLine[skip]);
        progressionLine[skip] = "..";*/

        //это рабочие строки, просто будут  использоваться по-дргуому в одном месте с остальными данными
        //конкретно сейчас выдает ошибку поэтому закомментил

        return rightAnswer;
    }

    public static String getQuestion() {

        /*question = "\nQuestion: ";
        for (int i = 0; i < progressionLine.length; i++) {
            question += progressionLine[i] + " ";
        }*/

        return question;
    }
}
