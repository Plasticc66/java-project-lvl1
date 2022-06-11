package hexlet.code;

import java.util.Scanner;

public class Engine {

    static final int WinForEnd = 3;

    public static int getWinForEnd() {
        return WinForEnd;
    }

    private static String question;

    public static String getQuestion() {
        return question;
    }

    private static int rightAnswer;
    public static int getRightAnswer() {
        return rightAnswer;
    }

    private static String rightAnswerString;

    public static String getRightAnswerString() {
        return getRightAnswerString();
    }

    private static int winstreakForCongrats = 0;

    public static int getWinstreakForCongrats() {
        return winstreakForCongrats;
    }

    private static boolean lose = false;

    public static boolean itLose() {
        return lose;
    }

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
            winstreakForCongrats++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                    + "'.\nLet's try again, " + Cli.getName() + "!");
            lose = true;
        }

        if (winstreakForCongrats == WinForEnd) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
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
            winstreakForCongrats++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswerString
                    + "'.\nLet's try again, " + Cli.getName() + "!");
            lose = true;
        }

        if (winstreakForCongrats == WinForEnd) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

}

