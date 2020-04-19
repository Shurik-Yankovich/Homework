package Week_5.Homeworks;

//Задача 2
//Создадим список чисел и добавим в него 10 чисел с клавиатуры. Наша задача состоит в том,
// чтобы вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithNumbers {

    private static final int quantity = 10;

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int longestSequence;

        System.out.println("Введите " + quantity + " чисел:");
        for (int i = 0; i < quantity; i++) {
            numbers.add(scanner.nextInt());
        }

        longestSequence = longestSequenceOfRepeatingNumbers(numbers);

        System.out.print("В последовательности: ");
        System.out.println(numbers);
        System.out.println("Длина самой длинной последовательности повторяющихся чисел равна " + longestSequence);

    }

    private static int longestSequenceOfRepeatingNumbers(List<Integer> numbers) {
        int longestSequence = 0;
        int count = 1;
        for (int i = 1; i < quantity; i ++) {
            if (numbers.get(i).equals(numbers.get(i - 1))) {
                count++;
            } else {
                longestSequence = Math.max(longestSequence, count);
                count = 1;
            }
        }
        longestSequence = Math.max(longestSequence, count);
        return longestSequence;
    }

}
