package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    //ЗАЧЕМ МНЕ ЭТИ ПОЛЯ, ПОЧ ИМЕННО ПОЛЯ, ПОЧЕМУ НЕ ПРОСТЫЕ ПЕРЕМЕННЫЕ В МЕТОДЕ ММ?
    //потому, что если объявить их как статик, то можно юзать сразу в нескольких методах, это удобно

    public static String rule = "What is the result of the expression?";
    public static String question;
    public static int rightAnswer;

    static int oper;
    static int temp1;
    static int temp2;

    //main game-method
    public static void playCalc() {

        final int rndmBound = 18;
        final int operBound = 3;
        Random rndm = new Random();

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.getWinForEnd(); winStreak++) {
            if (Engine.lose == false) {

                oper = rndm.nextInt(operBound);
                temp1 = rndm.nextInt(rndmBound) + 2;
                temp2 = rndm.nextInt(rndmBound) + 2;

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
