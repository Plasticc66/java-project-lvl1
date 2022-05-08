package hexlet.code;

import hexlet.code.Cli;

public class Greet {
    public static String playGreet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May i have  your name?");
        String name = hexlet.code.Cli.name();
        System.out.println("Hello, " + name);
        return name;
    }
}
