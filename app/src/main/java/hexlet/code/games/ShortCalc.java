package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ShortCalc extends Engine {
    public final void getRule() {
        super.getRule();
        String rule = "\nWhat is the result of the expression?";
        System.out.println(rule);
    }

    public final String condition() {
        super.condition();
        Random rndm = new Random();
        final int rndmBound = 20;
        final int operBound = 3;
        int oper = rndm.nextInt(operBound);

        int temp1 = rndm.nextInt(rndmBound);
        int temp2 = rndm.nextInt(rndmBound);

        switch (oper) {
            case 0:
                System.out.println("Question: " + temp1 + " + " + temp2);
                int rightAnswerInside = temp1 + temp2;
                return Integer.toString(rightAnswerInside);

            case 1:
                System.out.println("Question: " + temp1 + " - " + temp2);
                rightAnswerInside = temp1 - temp2;
                return Integer.toString(rightAnswerInside);

            default:
                System.out.println("Question: " + temp1 + " * " + temp2);
                rightAnswerInside = temp1 * temp2;
                return Integer.toString(rightAnswerInside);
        }




    }

}
