package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;

public class GCD {

    public static String rule = "Find the greatest common divisor of given numbers.";
    public static String question;
    public static int rightAnswer = 1;

    static int temp1;
    static int temp2;

    public static void playGCD() {
        Random random = new Random();
        int randomBound = 98;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.winForEnd; winStreak++) {
            if (Engine.lose == false) {
                while (rightAnswer == 1) {
                    do {
                        temp1 = random.nextInt(randomBound) + 2;
                        temp2 = random.nextInt(randomBound) + 2;
                    }
                    while (temp1 == temp2);
                    getRightAnswer();
                }

                Engine gcd = new Engine(
                        getRightAnswer(),
                        getQuestion());

                gcd.playThisGame();
                rightAnswer = 1;

            }
        }
    }

    public static int getRightAnswer() {
        ArrayList<Integer> divTemp1 = new ArrayList<>();
        ArrayList<Integer> divTemp2 = new ArrayList<>();

        //divisors search
        for (int i = 2; i < temp1 + 1; i++) {
            if (temp1 % i == 0) {
                divTemp1.add(i);
            }
            if (temp2 % i == 0) {
                divTemp2.add(i);
            }
        }

        if (divTemp1.size() == 1 || divTemp2.size() == 1) {
            if (divTemp2.get(0) == divTemp1.get(0)) {
                rightAnswer = divTemp1.get(0);
            }
        } else {
            for (int i = divTemp1.size() - 1; i > 0; i--) {
                for (int j = divTemp2.size() - 1; j > 0; j--) {
                    if (divTemp2.get(j).equals(divTemp1.get(i))) {
                        rightAnswer = divTemp1.get(i);
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
        }
        return rightAnswer;
    }

    public static String getQuestion() {
        question = "\nQuestion: " + temp1 + " " + temp2;
        return question;
    }

}
