package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.GDC;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

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
        switch (EnterGame.choiceGame()) {
            case greetNum:
                Greet.playGreet();
                break;
            case evenNum:
                Even even = new Even();
                even.playThisGame();
                break;
            case calcNum:
                Calc calc = new Calc();
                calc.playThisGame();
                break;
            case gdcNum:
                GDC gdc = new GDC();
                gdc.playThisGame();
                break;
            case progressionNum:
                Progression progression = new Progression();
                progression.playThisGame();
                break;
            case primeNum:
                Prime prime = new Prime();
                prime.playThisGame();
                break;
            case exitNum: System.out.println("Goodbye, have a nice day!");
                break;
            default:
                System.out.println("wrong data T_T");
        }

    }
}
