package lecture.week2.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] marks = new int[20];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(100);
        }
        int menuItem;
        boolean step = true;
        do {
            textMenu();
            //menuItem = scan.nextInt();
            switch (scan.nextInt()){
                case 1:
                    Exercise1.printIndexMaxMark(marks);
                    break;
                case 2:
                    Exercise2.sumElement(marks);
                    break;
                case 3:
                    Exercise3.printArray(marks);
                    break;
                case 4:
                    step = false;
                    break;
                default:
                    System.out.println("Неверно выбран пункт меню! Попробуйте еще раз!\n");
            }
        } while (step);
    }

    public static void textMenu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Найти в массиве оценок индекс максимальной оценки.");
        System.out.println("2 - Определите сумму элементов массива оценок, расположенных между " +
                "минимальным и максимальным значениями.");
        System.out.println("3 - Распечатать, перевернуть, и снова распечатать массив оценок.");
        System.out.println("4 - Закончить выполнение программы.");
    }

}
