package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ShortEven extends Engine {
    public final void getRule() {
        super.getRule();
        String rule = "\nAnswer 'yes' if number is even, otherwise answer 'no'.";
        System.out.println(rule);
    }



    public final String condition() {
        super.condition();
        String rightAnswerInside = null;
        Random rndm = new Random();
        final int rndmBound = 20;
        int temp = rndm.nextInt(rndmBound);

        System.out.println("Question: " + temp);
        if (temp % 2 == 0) {
            rightAnswerInside = "yes";
        } else {
            rightAnswerInside = "no";
        }
        return rightAnswerInside;
    }
}
