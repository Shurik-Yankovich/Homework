package Minsk.Homework_7.Task_3.Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    private static final Random random = new Random(System.currentTimeMillis());

    public static List<Integer> randomNumbersGenerator(int countOfNumbers) {
        List<Integer> numbers = new ArrayList<>();
        int number;

        while (numbers.size() < countOfNumbers) {
            number = 1 + random.nextInt(49);
            if (!numberInArray(number, numbers)) {
                numbers.add(number);
            }
        }

        return numbers;
    }

    private static boolean numberInArray (int number, List<Integer> array) {
        for (int arrayNumber : array) {
            if (number == arrayNumber) {
                return true;
            }
        }
        return false;
    }
}
