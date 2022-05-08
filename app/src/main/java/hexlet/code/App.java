package hexlet.code;

import hexlet.code.games.ShortCalc;
import hexlet.code.games.ShortEven;

public class App {
    public static void main(String[] args) {

        System.out.println("\nPlease enter the game number and press Enter"
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - name4"
                + "\n5 - name5"
                + "\n0 - Exit");
        System.out.print("your choice: ");
        switch (EnterGame.choiceGame()) {
            case 1:
                Greet.playGreet();
                break;
            case 2:
                ShortEven shortEven = new ShortEven();
                shortEven.playThisGame();
                break;
            case 3:
                ShortCalc shortCalc = new ShortCalc();
                shortCalc.playThisGame();
                break;
            case 0: System.out.println("Goodbye, have a nice day!");
                break;
            default:
                System.out.println("wrong data T_T");
        }




    }
}
