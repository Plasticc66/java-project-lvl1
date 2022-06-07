package hexlet.code.updGames;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static String rule = "Answer 'yes' if number is even, otherwise answer 'no'.";
    public static String question;
    public static String rightAnswer;
    static int temp;

    public static void playEven() {


        Random random = new Random();
        final int randomBound = 20;

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.winForEnd; winStreak++) {
            if (Engine.lose == false) {

                temp = random.nextInt(randomBound);
                Engine even = new Engine(
                        getRightAnswer(),
                        getQuestion());
                even.playThisGame("StringType");
                question = null;
            }
        }

    }

    public static String getQuestion() {
        question = "\nQuestion: " + temp;
        return question;
    }

    public static String getRightAnswer() {
        if (temp % 2 == 0) {
            rightAnswer = "yes";
        } else {
            rightAnswer = "no";
        }
        return rightAnswer;
    }

}
