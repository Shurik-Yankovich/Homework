package lecture.week2.array.exercise;

/*
Задание 15 из тетради.
Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
        */

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void sumElement(int[] marks) {
//        int marks[] = new int [10];
        int indexMin;
        int indexMax;
//        System.out.println("Введите массив из " + marks.length + " чисел");
////        Scanner scan = new Scanner(System.in);
////        for (int i = 0; i < marks.length; i++) {
////            marks[i] = scan.nextInt();
////        }

        indexMax = indexMaxValue(marks);
        indexMin = indexMinValue(marks);
        if (indexMin < indexMax)
            System.out.println("Сумма элементов массива от " + indexMin + " до " + indexMax
                    + " равна " + sumFromTo(marks, indexMin, indexMax));
        else
            System.out.println("Сумма элементов массива от " + indexMax + " до " + indexMin
                    + " равна " + sumFromTo(marks, indexMax, indexMin));
        System.out.println();
    }

    public static int indexMaxValue (int[] marks) {
        int index = 0;
        int maxValue = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxValue < marks[i]) {
                maxValue = marks[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexMinValue (int[] marks) {
        int index = 0;
        int minValue = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (minValue > marks[i]) {
                minValue = marks[i];
                index = i;
            }
        }
        return index;
    }

    public static int sumFromTo (int[] marks, int indexFrom, int indexTo) {
        int sum = 0;
        for (int i = indexFrom + 1; i < indexTo; i++) {
            sum += marks[i];
        }
        return sum;
    }
}
