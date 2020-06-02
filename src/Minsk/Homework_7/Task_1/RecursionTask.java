package Minsk.Homework_7.Task_1;

//Дано натуральное число N. Нужно с помощью рекурсивного метода вывести в консоль числа от 0 до N.

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionTask {

    private static final int FIRST_NUMBER = 0;

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число:");
        try {
            number = scanner.nextInt();
            recursionPrintNumbers(FIRST_NUMBER, number);
        } catch (InputMismatchException e) {
            System.out.println("Неверно введено число.");
        }
        scanner.close();
    }

    private static void recursionPrintNumbers(int firstNumber, int lastNumber) {
        if (firstNumber < lastNumber) {
            System.out.println(firstNumber);
            recursionPrintNumbers(firstNumber + 1, lastNumber);
        } else {
            System.out.println(lastNumber);
        }
    }
}
