package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static int winForEnd = 3;
    public static String question;
    public static int rightAnswer;
    public static String rightAnswerString;
    public static int winstreak = 0;
    public static boolean lose = false;

    public Engine(int rightAnswer, String question) {
        this.question = question;
        this.rightAnswer = rightAnswer;
    }

    public Engine(String rightAnswerString, String question) {
        this.question = question;
        this.rightAnswerString = rightAnswerString;
    }

    //WIN-LOSE LOGIC
    public static void playThisGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        System.out.print("Your answer: ");
        int playerAnswer = scanner.nextInt();

        if (playerAnswer == rightAnswer) {
            System.out.println("Correct!");
            winstreak++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                    + "'.\nLet's try again, " + Cli.name + "!");
            lose = true;
        }

        if (winstreak == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }

    //overwrite lvl jun
    public static void playThisGame(String type) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        System.out.print("Your answer: ");
        String playerAnswer = scanner.nextLine();

        if (playerAnswer.equals(rightAnswerString)) {
            System.out.println("Correct!");
            winstreak++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswerString
                    + "'.\nLet's try again, " + Cli.name + "!");
            lose = true;
        }

        if (winstreak == 3) {
            System.out.println("Congratulations, " + Cli.name + "!");
        }
    }

}

