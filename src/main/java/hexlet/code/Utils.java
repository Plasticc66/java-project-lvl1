package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random RANDOM = new Random();

    public static int getRandomInt(int leftBound, int rightBound) {
        return RANDOM.nextInt(rightBound - leftBound) + leftBound;
    }
}
