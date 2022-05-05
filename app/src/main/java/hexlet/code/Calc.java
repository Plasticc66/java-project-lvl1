package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void playCalc() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have  your name?");
        String name = Cli.name();
        System.out.println("Hello, " + name);

        System.out.println("What is the result of the expression?");
        Random rndm = new Random();
        Scanner scanner = new Scanner(System.in);
        int winstrik = 0;
        boolean win = false;
        int answer = 1;
        int rightAnswer = 0;
        int numForWin = 3;
        int operBound = 3;
        int oper = rndm.nextInt(operBound);
        int numBound = 20;


        switch (oper){
            case 0:
                while (!win) {
                int num1 = rndm.nextInt(numBound);
                int num2 = rndm.nextInt(numBound);
                System.out.println("Question: " + num1 + " + " + num2);
                rightAnswer = num1 + num2;
                System.out.println("Your answer: ");
                answer = scanner.nextInt();

                    if (answer == rightAnswer) {
                        System.out.println("Conrrect!");
                        winstrik++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                                + "'.\nLet's try again, " + name);
                        break;
                    }
                    if (winstrik==numForWin){
                        System.out.println("Congratulations, " + name + "!");
                        win=true;
                    }
                }
                break;
            case 1:
                while (!win) {
                    int num1 = rndm.nextInt(numBound);
                    int num2 = rndm.nextInt(numBound);
                System.out.println("Question: " + num1 + " - " + num2);
                rightAnswer = num1 - num2;
                System.out.println("Your answer: ");
                answer = scanner.nextInt();

                    if (answer == rightAnswer) {
                        System.out.println("Conrrect!");
                        winstrik++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                                + "'.\nLet's try again, " + name);
                        break;
                    }
                    if (winstrik==numForWin){
                        System.out.println("Congratulations, " + name + "!");
                        win=true;
                    }
                }
                break;
            case 2:
                while (!win) {
                    int num1 = rndm.nextInt(numBound);
                    int num2 = rndm.nextInt(numBound);
                System.out.println("Question: " + num1 + " * " + num2);
                rightAnswer = num1 * num2;
                System.out.println("Your answer: ");
                answer = scanner.nextInt();

                    if (answer == rightAnswer) {
                        System.out.println("Conrrect!");
                        winstrik++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                                + "'.\nLet's try again, " + name);
                        break;
                    }
                    if (winstrik==numForWin){
                        System.out.println("Congratulations, " + name + "!");
                        win=true;
                    }
                }
                break;
        }

    }
}
