package hexlet.code;

import hexlet.code.games.GDC;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {

        System.out.println("\nPlease enter the game number and press Enter"
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GDC"
                + "\n5 - name5"
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
            case 0: System.out.println("Goodbye, have a nice day!");
                break;
            default:
                System.out.println("wrong data T_T");
        }

    }
}
