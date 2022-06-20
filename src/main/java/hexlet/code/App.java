package hexlet.code;

import hexlet.code.games.*;

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


        switch (choice) {
            case greetNum:
                Cli.greeting();
                break;
            case evenNum:
                Cli.greeting();
                Even.playEven();
                break;
            case calcNum:
                Cli.greeting();
                Calc.playCalc();
                break;
            case gcdNum:
                Cli.greeting();
                GCD.playGCD();
                break;
            case progressionNum:
                Cli.greeting();
                Progression.playProgression();
                break;
            case primeNum:
                Cli.greeting();
                Prime.playPrime();
                break;
            case exitNum:
                System.out.println("Goodbye, have a nice day!");
            default:
                throw new Error("Unknown value: " + choice);
        }
    }
}

