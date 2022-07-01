package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random RANDOM = new Random();

    public static int getRandomInt(int leftBound, int rightBound) {
        return RANDOM.nextInt(rightBound - leftBound) + leftBound;
    }

    public static char getRandomOperation() {
        final int rightBound = 3;
        int operationInt = Utils.getRandomInt(0, rightBound);
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
