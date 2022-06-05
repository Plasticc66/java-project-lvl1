package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static int winForEnd = 3;
    public static String question;
    public static int rightAnswer;
    public static int winstreak = 0;
    public static boolean lose = false;

    public Engine(String question, int rightAnswer) {
        this.question = question;
        this.rightAnswer = rightAnswer;
    }

    public static void playThisGame(String name) {
        Scanner scanner = new Scanner(System.in);

        //WIN-LOSE LOGIC
        System.out.println(question);
        System.out.print("Your answer: ");
        int playerAnswer = scanner.nextInt();

        if (playerAnswer == rightAnswer) {
            System.out.println("Correct!");
            winstreak++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                    + "'.\nLet's try again, " + name + "!");
            lose = true;
        }
        if (winstreak == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}

