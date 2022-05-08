package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class GDC extends Engine {

    public final String getRule() {
        super.getRule();
        return "\nFind the greatest common divisor of given numbers.";
    }

    public final String condition() {
        super.condition();
        Random rndm = new Random();
        final int rndmBound = 100;
        int rightAnswerInside = 1;

        int temp1 = rndm.nextInt(rndmBound);
        int temp2 = rndm.nextInt(rndmBound);

        System.out.println("\nQuestion: " + temp1 + " " + temp2);

        if (temp1 == 0 || temp2 == 0) {
            return Integer.toString(rightAnswerInside);
        } else {

        ArrayList<Integer> divTemp1 = new ArrayList<>();
        ArrayList<Integer> divTemp2 = new ArrayList<>();

        for (int i = 1; i < Math.abs(temp1) + 1; i++) {
            if (temp1 % i == 0) {
                divTemp1.add(i);
            }
        }
        for (int i = 1; i < Math.abs(temp2) + 1; i++) {
            if (temp2 % i == 0) {
                divTemp2.add(i);
            }
        }

            for (int i = divTemp1.size() - 1; i >= 0; i--) {
                for (int j = divTemp2.size() - 1; j >= 0; j--) {
                    if (Objects.equals(divTemp1.get(i), divTemp2.get(j))) {
                        rightAnswerInside = divTemp1.get(i);
                        break;
                    } else {
                        if (divTemp1.get(i) > divTemp2.get(j)) {
                            i--;
                            j++;
                        }
                    }

                }
                break;
            }

            return Integer.toString(rightAnswerInside);
        }

    }
}