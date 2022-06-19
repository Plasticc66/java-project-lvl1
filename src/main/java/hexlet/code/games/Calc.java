package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    //ЗАЧЕМ МНЕ ЭТИ ПОЛЯ, ПОЧ ИМЕННО ПОЛЯ, ПОЧЕМУ НЕ ПРОСТЫЕ ПЕРЕМЕННЫЕ В МЕТОДЕ ММ?
    //потому, что если объявить их как статик, то можно юзать сразу в нескольких методах, это удобно (?)

    private static final String RULE = "What is the result of the expression?";
    private static String question;
    private static int rightAnswer;

    private static int oper;
    private static int temp1;
    private static int temp2;

    //main game-method
    public static void playCalc() {
        final int leftBound = 2;
        final int rightBound = 18;
        final int operationBound = 3;

        System.out.println(RULE);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (!Engine.itLose()) {

                oper = Utils.getRandomInt(0,operationBound);
                temp1 = Utils.getRandomInt(leftBound,rightBound);
                temp2 = Utils.getRandomInt(leftBound,rightBound);


                Engine calc = new Engine(
                        getRightAnswer(),
                        getQuestion());

                calc.playThisGame();
            }
        }
    }

    //generate question
    public static String getQuestion() {
        question = "\nQuestion: ";

        switch (oper) {
            case 0:
                question += temp1 + " + " + temp2;
                return question;
            case 1:
                question += temp1 + " - " + temp2;
                return question;
            case 2:
                question += temp1 + " * " + temp2;
                return question;
            default:
                throw new Error("Unknown value: " + oper);
        }

    }

    //calculate right answer
    public static int getRightAnswer() {

        switch (oper) {
            case 0:
                rightAnswer = temp1 + temp2;
                return rightAnswer;
            case 1:
                rightAnswer = temp1 - temp2;
                return rightAnswer;
            case 2:
                rightAnswer = temp1 * temp2;
                return rightAnswer;
            default:
                throw new Error("Unknown value: " + oper);

        }

    }

}
