package hexlet.code;
import java.util.Scanner;

public class EnterGame {
    public static int choiceGame() {

        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
