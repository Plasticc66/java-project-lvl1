package hexlet.code;
public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter\n1 - Greet\n2 - Even\n3 - name3\n4 - name4\n5 "
                + "- name5\n0 - Exit");
        System.out.print("your choice: ");
        switch (EnterGame.choiceGame()) {
            case 1: Greet.playGreet();
                break;
            case 2: Even.playEven();
                break;
            case 3: Calc.playCalc();
                break;
            case 0: System.out.println("Goodbye, have a nice day!");
                break;
            default:
                System.out.println("wrong data T_T");
        }




    }
}
