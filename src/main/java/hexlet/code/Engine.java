package hexlet.code;

import java.util.Scanner;

public class Engine {



//--------------________________--------___------___-____-----___----------------------------

    /*Два метода почти одинаковых, это сигнал что что-то не так.
    Пусть в классе Engine будет только один метод который вызывается из всех игр:

    public static void run(String description, String[][] roundsData) {
//...
    }*/


//________________----___----___----___----___----___---____---___---__----___---___-___----__----___-

    static final int WIN_FOR_END = 3;

    public static int getWinForEnd() {
        return WIN_FOR_END;
    }

    private static String question;

    public static String getQuestion() {
        return question;
    }

    private static int rightAnswer;

    public static int getRightAnswer() {
        return rightAnswer;
    }

    private static String rightAnswerString;

    public static String getRightAnswerString() {
        return getRightAnswerString();
    }

    private static int winstreakForCongrats = 0;

    public static int getWinstreakForCongrats() {
        return winstreakForCongrats;
    }

    private static boolean lose = false;

    public static boolean itLose() {
        return lose;
    }

    public Engine(int rightAnswerInside, String questionInside) {
        this.question = questionInside;
        this.rightAnswer = rightAnswerInside;
    }

    public Engine(String rightAnswerStringInside, String questionInside) {
        this.question = questionInside;
        this.rightAnswerString = rightAnswerStringInside;
    }

    public static void run(String rule, String[] questionsAndAnswers) {
        //буду записывать в массив вопрос-ответ-вопрос-ответ
        //четные индексы = вопросы
        //и наоборот соотв
        //длинна уже будет выбираться самой игрой, так что здесь нужен будет цикл
        System.out.println(rule);

        for (int i = 0; i < questionsAndAnswers.length; i = +2) {

            System.out.println(questionsAndAnswers[i]);
            Scanner scanner = new Scanner(System.in);
            String playerAnswer = scanner.nextLine();

            if (questionsAndAnswers[i + 1].equals(playerAnswer)) {
                System.out.println("Correct!");
                winstreakForCongrats++;
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                        + "'.\nLet's try again, " + "NONAME" + "!");
                lose = true;
            }

            if (winstreakForCongrats == WIN_FOR_END) {
                System.out.println("Congratulations, " + "NONAME" + "!");
            }

        }
    }


    //---------------------------------------------------------
    //WIN-LOSE LOGIC
    public static void playThisGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        System.out.print("Your answer: ");
        int playerAnswer = scanner.nextInt();

        if (playerAnswer == rightAnswer) {
            System.out.println("Correct!");
            winstreakForCongrats++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer
                    + "'.\nLet's try again, " + "NONAME" + "!");
            lose = true;
        }

        if (winstreakForCongrats == WIN_FOR_END) {
            System.out.println("Congratulations, " + "NONAME" + "!");
        }
    }

    //overwrite lvl jun
    public static void playThisGame(String type) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        System.out.print("Your answer: ");
        String playerAnswer = scanner.nextLine();

        if (playerAnswer.equals(rightAnswerString)) {
            System.out.println("Correct!");
            winstreakForCongrats++;
        } else {
            System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswerString
                    + "'.\nLet's try again, " + "NONAME" + "!");
            lose = true;
        }

        if (winstreakForCongrats == WIN_FOR_END) {
            System.out.println("Congratulations, " + "NONAME" + "!");
        }
    }
    //--------------------------------------------------------------------------

}
