package hexlet.code.updGames;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";
    public static String question;
    public static String rightAnswer;

    public static void playEven() {


        Random rndm = new Random();
        final int rndmBound = 20;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.winForEnd; winStreak++) {
            if (Engine.lose == false) {

                int temp = rndm.nextInt(rndmBound);
                Engine even = new Engine(
                        getRightAnswer(temp),
                        getQuestion(temp));
                even.playThisGame("StringType");
                question = null;
            }
        }

    }

    public static String getQuestion(int temp) {
        question = "\nQuestion: " + temp;
        return question;
    }

    public static String getRightAnswer(int temp) {
        if (temp % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }

}
