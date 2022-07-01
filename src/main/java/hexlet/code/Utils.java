package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random random = new Random();

    public static int getRandomInt(int leftBound, int rightBound) {
        return random.nextInt(rightBound - leftBound) + leftBound;
    }

    public static char getRandomOperation() {
        int operationInt = Utils.getRandomInt(0, 3);
        char operation = 0;
        switch (operationInt) {
            case 0 -> {
                operation = '+';
                return operation;
            }
            case 1 -> {
                operation = '-';
                return operation;
            }
            case 2 -> {
                operation = '*';
                return operation;
            }
            default -> throw new Error("Unknown value: " + operation);
        }
    }
}
