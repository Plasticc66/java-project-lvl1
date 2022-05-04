package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have  your name?");
        String name = Cli.name();
        System.out.println("Hello, " + name);

        System.out.println("Answer 'yes' if number is even, otherwise answer 'no'.");
        Random rndm = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean win = false;
        int winstrike = 0;
        String rightAnswer = "";
        while (!win) {
            final int bound = 20;
            int temp = rndm.nextInt(bound);
            System.out.println("Question: " + temp);
            if (temp % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(rightAnswer)) {
                winstrike++;
                System.out.println("Correct!");

            } else {
                winstrike = 0;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + name);
            }
            final int numForWin = 3;
            if (winstrike == numForWin) {
                System.out.println("Congratulations, " + name + "!");
                win = true;
            }
        }
    }
}
