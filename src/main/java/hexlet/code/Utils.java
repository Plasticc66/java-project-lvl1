package hexlet.code;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    public static int getRandomInt (int leftBound, int rightBound) {
        int temp = random.nextInt(rightBound-leftBound)+leftBound;
        return temp;
    }
}
