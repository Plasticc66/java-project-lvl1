package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {

        System.out.println("\nWelcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("\nHello, " + name + "!");
    }
}
