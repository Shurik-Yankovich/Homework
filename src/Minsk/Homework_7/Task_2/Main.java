package Minsk.Homework_7.Task_2;

//Дано многозначное число N (например, 123456). Нужно с помощью рекурсивного метода вывести обратный порядок чисел (654321).

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long number;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите многозначное число:");
            number = scanner.nextInt();
            System.out.println("Зеркальное отображение числа:");
            recursionMirrorImageNumber(number);
        } catch (InputMismatchException e) {
            System.out.println("Неверно введено число.");
        }
        scanner.close();
    }

    private static void recursionMirrorImageNumber(long number) {
        if (number / 10 > 0) {
            System.out.print(number % 10);
            recursionMirrorImageNumber(number / 10);
        } else {
            System.out.println(number);
        }
    }

}
