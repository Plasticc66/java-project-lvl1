package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void playCalc() {

        String rule = "What is the result of the expression?";

        final int amountData = 6;
        String[] questionsAndAnswers = new String[amountData];

        int operation;
        int temp1;
        int temp2;

        final int leftBound = 2;
        final int rightBound = 18;
        final int operationBound = 3;


        for (int i = 0; i < amountData; i += 2) {

            operation = Utils.getRandomInt(0, operationBound);
            temp1 = Utils.getRandomInt(leftBound, rightBound);
            temp2 = Utils.getRandomInt(leftBound, rightBound);

            String answer = "";
            String question = "\nQuestion: ";

            Calc.fillArray(i, questionsAndAnswers, temp1, temp2, operation);
        }

        Engine.run(rule, questionsAndAnswers);
    }

    public static String[] fillArray(int i, String[] array, int temp1, int temp2, int operation) {

        switch (operation) {
            case 0:
                array[i] = "\nQuestion: " + temp1 + " + " + temp2;
                array[i + 1] = String.valueOf(temp1 + temp2);
                return array;
            case 1:
                array[i] = "\nQuestion: " + temp1 + " - " + temp2;
                array[i + 1] = String.valueOf(temp1 - temp2);
                return array;
            case 2:
                array[i] = "\nQuestion: " + temp1 + " * " + temp2;
                array[i + 1] = String.valueOf(temp1 * temp2);
                return array;
            default:
                throw new Error("Unknown value: " + operation);
        }
    }
}
