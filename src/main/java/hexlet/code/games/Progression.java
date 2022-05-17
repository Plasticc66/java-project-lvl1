package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression extends Engine {
    public final String getRule() {
        String rule = "\nWhat number is missing in the progression?";
        return rule;
    }

    public final String condition() {
        Random rndm = new Random();
        final int rndmBound = 21;
        final int skipBound = 10;
        final int stepBound = 7;
        final int lengthArray = 10;

        int step = rndm.nextInt(stepBound) + 2;
        int firstNum = rndm.nextInt(rndmBound);
        int skip = rndm.nextInt(skipBound);
        String[] progressionLine = new String[lengthArray];
        progressionLine[0] = Integer.toString(firstNum);

        for (int i = 1; i < progressionLine.length; i++) {
            progressionLine[i] = Integer.toString(Integer.parseInt(progressionLine[i - 1]) + step);
        }

        String rightAnswerInside = progressionLine[skip];
        progressionLine[skip] = "..";
        System.out.print("\nQuestion: ");
        for (int i = 0; i < progressionLine.length; i++) {
            System.out.print(progressionLine[i] + " ");
        }
        System.out.print("\n");
        return rightAnswerInside;

    }
}
