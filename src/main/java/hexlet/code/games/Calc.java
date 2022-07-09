package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final String RULE = "What is the result of the expression?";
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void playCalc() {

        String[][] questionsAndAnswers = new String[Engine.WIN_FOR_END][2];

        final int leftBound = 2;
        final int rightBound = 18;

        for (int i = 0; i < Engine.WIN_FOR_END; i++) {

            int indexOperator = Utils.getRandomInt(0, OPERATORS.length - 1);
            char operator = OPERATORS[indexOperator];

            int number1 = Utils.getRandomInt(leftBound, rightBound);
            int number2 = Utils.getRandomInt(leftBound, rightBound);

            questionsAndAnswers[i][0] = number1 + " " + operator + " " + number2;

            questionsAndAnswers[i][1] = Calc.calculate(number1, number2, operator);
        }
        Engine.run(RULE, questionsAndAnswers);
    }

    public static String calculate(int number1, int number2, char operator) {

        switch (operator) {
            case '+':
                String answer = String.valueOf(number1 + number2);
                return answer;

            case '-':
                answer = String.valueOf(number1 - number2);
                return answer;

            case '*':
                answer = String.valueOf(number1 * number2);
                return answer;

            default:
                throw new Error("Unknown value: " + operator);

        }
    }
}
