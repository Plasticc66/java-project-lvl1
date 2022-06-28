package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomInt(int leftBound, int rightBound) {
        Random random = new Random();
        return random.nextInt(rightBound - leftBound) + leftBound;
    }
}
