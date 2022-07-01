package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final String rule = "What is the result of the expression?";

    public static void playCalc() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        char operation;
        int number1;
        int number2;

        final int leftBound = 2;
        final int rightBound = 18;
        final int numRounds = 3;

        for (int i = 0; i < numRounds; i++) {

            operation = Utils.getRandomOperation();
            number1 = Utils.getRandomInt(leftBound, rightBound);
            number2 = Utils.getRandomInt(leftBound, rightBound);

            Calc.fillArray(i, questionsAndAnswers, number1, number2, operation);
        }
        Engine.run(rule, questionsAndAnswers);
    }

    public static void fillArray(int i, String[][] array, int num1, int num2, char operation) {

        array[i][0] = "\nQuestion: " + num1 + " " + operation + " " + num2;

        switch (operation) {
            case '+' -> array[i][1] = String.valueOf(num1 + num2);
            case '-' -> array[i][1] = String.valueOf(num1 - num2);
            case '*' -> array[i][1] = String.valueOf(num1 * num2);
            default -> throw new Error("Unknown value: " + operation);
        }
    }
}
