package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    public final String condition() {

        Random rndm = new Random();
        final int rndmBound = 98;
        String rightAnswerInsede = "no";

        int temp = rndm.nextInt(rndmBound) + 2;
        System.out.println("Question: " + temp);
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                rightAnswerInsede = "no";
                break;
            } else {
                rightAnswerInsede = "yes";
            }
        }
        return rightAnswerInsede;
    }
}
