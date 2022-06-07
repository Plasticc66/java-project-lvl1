package hexlet.code;

import hexlet.code.games.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> choices = new ArrayList<>();

        final int greetNum = 1;
        choices.add(greetNum);
        final int evenNum = 2;
        choices.add(evenNum);
        final int calcNum = 3;
        choices.add(calcNum);
        final int gcdNum = 4;
        choices.add(gcdNum);
        final int progressionNum = 5;
        choices.add(progressionNum);
        final int primeNum = 6;
        choices.add(primeNum);
        final int exitNum = 0;
        choices.add(exitNum);

        boolean correctData = false;

        System.out.println("\nPlease enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");

        System.out.print("your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        //correct data?

        for (int i = 0; i < choices.size(); i++) {
            if (choice == choices.get(i)) {
                correctData = true;
                break;
            }
        }
        if (!correctData) {
            System.out.println("wrong data T_T");
        } else {

            //it exit?

            if (choice == exitNum) {
                System.out.println("Goodbye, have a nice day!");
            } else {

                //it ok, greet and play

                Cli.greeting();

                switch (choice) {
                    case greetNum:
                        break;
                    case evenNum:
                        Even.playEven();
                        break;
                    case calcNum:
                        Calc.playCalc();
                        break;
                    case gcdNum://BUG!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                        GCD.playGCD();
                        break;
                    case progressionNum:
                        Progression.playProgression();
                        break;
                    case primeNum:
                        Prime.playPrime();
                        break;

                    default:
                        throw new Error("Unknown value: " + choice);
                }
            }
        }
    }
}
