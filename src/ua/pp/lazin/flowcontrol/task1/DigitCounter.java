package ua.pp.lazin.flowcontrol.task1;

/**
 * @author Ruslan Lazin
 */
public class DigitCounter {

    public static int countDigits(long number, final int digit) {
        int count = 0;

        if (number < 0) {
            number = -number;
        }
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("Only digit accepted as second parameter");
        }
        if (number == 0 && digit == 0) {
            return 1;
        }

        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
