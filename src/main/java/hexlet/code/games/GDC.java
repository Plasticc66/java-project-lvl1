package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.updGames.Cli;

import java.util.ArrayList;
import java.util.Random;

public class GDC {

    public static String rule = "Find the greatest common divisor of given numbers.";
    public static String question;
    public static int rightAnswer = 1;

    static ArrayList<Integer> divTemp1 = new ArrayList<>();
    static ArrayList<Integer> divTemp2 = new ArrayList<>();

    public static void playGDC() {

        Cli.greeting();
        String name = Cli.name;

        final int rndmBound = 100;
        Random rndm = new Random();
        int temp1 = 0;
        int temp2 = 0;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.winForEnd; winStreak++) {
            if (Engine.lose == false) {
                do {
                    temp1 = rndm.nextInt(rndmBound) + 2;
                    temp2 = rndm.nextInt(rndmBound) + 2;
                    getRightAnswer(temp1, temp2);
                }
                while (rightAnswer == 1 && divTemp1.size() < 2 && divTemp2.size() < 2);

                Engine gbc = new Engine(
                        getRightAnswer(temp1, temp2),
                        getQuestion(temp1, temp2));

                gbc.playThisGame(name);
                question = null;
                rightAnswer = 1;
            }
        }
    }

    public static String getQuestion(int temp1, int temp2) {
        question = "\nQuestion: " + temp1 + " " + temp2;
        return question;
    }

    public static int getRightAnswer(int temp1, int temp2) {
        int k = 0;
        int l = 0;

        //get all divisors > 1
        for (int i = 2; i < Math.abs(temp1) + 1; i++) {
            if (temp1 % i == 0) {
                divTemp1.add(k);
                k++;
            }
        }

        for (int i = 2; i < Math.abs(temp2) + 1; i++) {
            if (temp2 % i == 0) {
                divTemp2.add(l);
                l++;
            }
        }

        //greatest coincide
        for (
                int i = divTemp1.size() - 1; i >= 2; i--) {
            for (int j = divTemp2.size() - 1; j >= 2; j--) {
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

        return rightAnswer;
    }


    /*public final String condition() {
        Random rndm = new Random();
        final int rndmBound = 100;
        int rightAnswerInside = 1;

        while (rightAnswerInside == 1) {

            int temp1 = rndm.nextInt(rndmBound) + 2;
            int temp2 = rndm.nextInt(rndmBound) + 2;

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
                    if (divTemp2.get(j).equals(divTemp1.get(i))) {
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
            if (rightAnswerInside != 1) {
                System.out.println("\nQuestion: " + temp1 + " " + temp2);
            }
        }
        return Integer.toString(rightAnswerInside);
    }*/
}
