package lecture.week2.array.exercise;

/*
Задание 16 из тетради.распечатать, перевернуть, и снова распечатать
Создать массив, заполнить его случайными элементами,
(при переворачивании нежелательно создавать еще один массив).
*/

import java.util.Random;

public class Exercise3 {
    public static void printArray(int[] array) {
//        Random random = new Random();
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
        System.out.println("Массив по порядку:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Массив перевернутый:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
