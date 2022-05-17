package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even extends Engine {
    public final String getRule() {
        String rule = "\nAnswer 'yes' if number is even, otherwise answer 'no'.";
        return rule;
    }



    public final String condition() {
        String rightAnswerInside = null;
        Random rndm = new Random();
        final int rndmBound = 20;
        int num = rndm.nextInt(rndmBound);

        System.out.println("\nQuestion: " + num);
        if (num % 2 == 0) {
            rightAnswerInside = "yes";
        } else {
            rightAnswerInside = "no";
        }
        return rightAnswerInside;
    }
}
