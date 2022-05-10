package hexlet.code;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {

        System.out.println("\nPlease enter the game number and press Enter"
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GDC"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");
        System.out.print("your choice: ");
        switch (EnterGame.choiceGame()) {
            case 1:
                Greet.playGreet();
                break;
            case 2:
                Even even = new Even();
                even.playThisGame();
                break;
            case 3:
                Calc calc = new Calc();
                calc.playThisGame();
                break;
            case 4:
                GDC gdc = new GDC();
                gdc.playThisGame();
                break;
            case 5:
                Progression progression = new Progression();
                progression.playThisGame();
                break;
            case 6:
                Prime prime = new Prime();
                prime.playThisGame();
                break;
            case 0: System.out.println("Goodbye, have a nice day!");
                break;
            default:
                System.out.println("wrong data T_T");
        }

    }
}
