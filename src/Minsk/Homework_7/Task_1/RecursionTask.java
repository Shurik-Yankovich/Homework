package Minsk.Homework_7.Task_1;

import java.util.Scanner;

public class RecursionTask {

    public static final int FIRST_NUMBER = 0;

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число:");
        number = scanner.nextInt();
        recursionPrintNumbers(FIRST_NUMBER, number);
    }

    public static void recursionPrintNumbers(int firstNumber, int lastNumber) {
        if (firstNumber < lastNumber) {
            System.out.println(firstNumber);
            recursionPrintNumbers(firstNumber + 1, lastNumber);
        } else {
            System.out.println(lastNumber);
        }
    }
}
