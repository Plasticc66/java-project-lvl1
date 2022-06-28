package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        final int greetNum = 1;
        final int evenNum = 2;
        final int calcNum = 3;
        final int gcdNum = 4;
        final int progressionNum = 5;
        final int primeNum = 6;
        final int exitNum = 0;

        System.out.println("""

                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        System.out.print("your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());


        switch (choice) {
            case greetNum:
                Cli.greeting();
                break;
            case evenNum:
                Even.playEven();
                break;
            case calcNum:
                Calc.playCalc();
                break;
            case gcdNum:
                GCD.playGCD();
                break;
            case progressionNum:
                Progression.playProgression();
                break;
            case primeNum:
                Prime.playPrime();
                break;
            case exitNum:
                System.out.println("Goodbye, have a nice day!");
            default:
                throw new Error("Unknown value: " + choice);
        }
    }
}

