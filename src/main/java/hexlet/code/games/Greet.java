package hexlet.code.games;

public class Greet {
    public static String playGreet() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May i have  your name? ");
        String name = hexlet.code.Cli.name();
        System.out.println("\nHello, " + name + "!");
        return name;
    }
}
