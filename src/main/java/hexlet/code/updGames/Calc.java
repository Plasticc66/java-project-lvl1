package hexlet.code.updGames;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    //ЗАЧЕМ МНЕ ЭТИ ПОЛЯ, ПОЧ ИМЕННО ПОЛЯ, ПОЧЕМУ НЕ ПРОСТЫЕ ПЕРЕМЕННЫЕ В МЕТОДЕ ММ?
    public static String rule = "What is the result of the expression?";
    public static String question;
    public static int rightAnswer;

    //main game-method
    public static void playCalc() {

        final int rndmBound = 18;
        final int operBound = 3;
        Random rndm = new Random();

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.winForEnd; winStreak++) {
            if (Engine.lose == false) {

                int oper = rndm.nextInt(operBound);
                int temp1 = rndm.nextInt(rndmBound) + 2;
                int temp2 = rndm.nextInt(rndmBound) + 2;

                Engine calc = new Engine(
                        getRightAnswer(temp1, temp2, oper),
                        getQuestion(temp1, temp2, oper));

                calc.playThisGame();
                question = null;
            }
        }
    }

    //generate question
    public static String getQuestion(int temp1, int temp2, int oper) {
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
    public static int getRightAnswer(int temp1, int temp2, int oper) {

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
