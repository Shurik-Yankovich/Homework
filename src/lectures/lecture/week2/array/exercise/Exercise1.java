package lecture.week2.array.exercise;

/*
Задание 14 из тетради.
В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
*/

import java.util.Scanner;

public class Exercise1 {

    public static void printIndexMaxMark(int[] marks) {
//        int marks[] = new int [10];
//        System.out.println("Введите массив оценок из " + marks.length + " чисел");
//        Scanner scan = new Scanner(System.in);
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = scan.nextInt();
//        }
        System.out.println("Индекс максимальной оценки равен " + indexMaxMarks(marks));
        System.out.println();
    }

    public static int indexMaxMarks(int[] marks) {
        int index = 0;
        int maxMark = 0;
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                index = i;
            }
        }
        return index;
    }
}
