package Utils;
import java.util.Random;

public class Dice {
    private static final Random rand = new Random();

    public static int roll(int sides) {
        return rand.nextInt(sides) + 1;
    }

    public static int roll(int numDice, int sides) {
        int total = 0;
        for (int i = 0; i < numDice; i++) {
            total += roll(sides);
        }
        return total;
    }

    public static int rollStat() {
        int[] rolls = new int[4];
        int sum = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            rolls[i] = roll(6);
            sum += rolls[i];
            if (rolls[i] < min) min = rolls[i];
        }
        return sum - min;
    }
}
