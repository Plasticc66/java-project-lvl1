package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    public static String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String question;
    public static String rightAnswer;

    static Random random = new Random();
    static final int randomBound = 98;
    static int temp;

    public static void playPrime() {

        System.out.println(rule);

        for (int winStreak = 0; winStreak < Engine.winForEnd; winStreak++) {
            if (Engine.lose == false) {

                temp = random.nextInt(randomBound) + 2;

                Engine prime = new Engine(
                        getRightAnswer(),
                        getQuestion());
                prime.playThisGame("StringType");
            }
        }

    }

    public static String getRightAnswer() {
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                rightAnswer = "no";
                break;
            } else {
                rightAnswer = "yes";
            }
        }
        return rightAnswer;
    }

    public static String getQuestion() {
        question = "\nQuestion: " + temp;
        return question;
    }

}
