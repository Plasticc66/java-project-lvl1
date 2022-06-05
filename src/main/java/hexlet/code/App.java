package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.GDC;
import hexlet.code.updGames.Calc;
import hexlet.code.games.Even;
import hexlet.code.updGames.Cli;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int greetNum = 1;
        final int evenNum = 2;
        final int calcNum = 3;
        final int gdcNum = 4;
        final int progressionNum = 5;
        final int primeNum = 6;
        final int exitNum = 0;

        System.out.println("\nPlease enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GDC"
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
               // Even.playEven();
                break;
            case calcNum:
                Calc.playCalc();
                break;
            case gdcNum:
               // GDC.playGDC("Find the greatest common divisor of given numbers.");
                break;
            case progressionNum:
               // Progression.playProgression("What number is missing in the progression?");
                break;
            case primeNum:
               // Prime.playPrime("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            case exitNum:
                System.out.println("Goodbye, have a nice day!");
                break;
            default:
                System.out.println("wrong data T_T");
        }

    }
}
