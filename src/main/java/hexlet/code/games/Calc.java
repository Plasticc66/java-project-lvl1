package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void playCalc() {

        Random rndm = new Random();
        final int rndmBound = 18;
        final int operBound = 3;
        int oper = rndm.nextInt(operBound);

        int temp1 = rndm.nextInt(rndmBound) + 2;
        int temp2 = rndm.nextInt(rndmBound) + 2;

        String rule = "What is the result of the expression?";
        String question = "\nQuestion: ";
        int rightAnswer;

        switch (oper) {
            case 0:
                question += temp1 + " + " + temp2;
                rightAnswer = temp1 + temp2;

            case 1:
                question += temp1 + " - " + temp2;
                rightAnswer = temp1 - temp2;

            case 2:
                question +=  temp1 + " * " + temp2;
                rightAnswer = temp1 * temp2;
            default:
                throw new Error("Unknown value: " + oper);
        }

        Engine.playThisGame(rule, question, rightAnswer);
    }

}
