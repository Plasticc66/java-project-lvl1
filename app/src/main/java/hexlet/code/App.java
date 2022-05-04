package hexlet.code;
public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter\n1 - Greet\n2 - name2\n3 - name3\n4 - name4\n5 " +
                "- name5\n0 - Exit");
        System.out.print("your choice: ");
        switch (enterGame.choiceGame()){
            case 1: System.out.println("Welcome to the Brain Games!");
                System.out.println("May i have  your name?");
                System.out.println("Hello, " + Cli.name());
                break;
            case 0: System.out.println("Goodbye, have a nice day!");
            break;
            default:
                System.out.println("wrong data T_T");
        }




    }
}
