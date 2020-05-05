package Minsk.Homeworks_4.Generator;

import java.util.Random;

public class NumberGenerator {

    private static final Random random = new Random(System.currentTimeMillis());

    public static int[] randomNumbersGenerator(int countOfNumbers) {
        int[] numbers = new int[countOfNumbers];
        int number;
        int i = 0;

        do {
            number = 1 + random.nextInt(49);
            if (!numberInArray(number, numbers)) {
                numbers[i] = number;
                i++;
            }
        } while (i < countOfNumbers);

        return numbers;
    }

    private static boolean numberInArray (int number, int[] array) {
        for (int arrayNumber : array) {
            if (number == arrayNumber)
                return true;
        }
        return false;
    }
}
