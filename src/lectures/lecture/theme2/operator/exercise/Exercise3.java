package lecture.theme2.operator.exercise;

/*
Дано число. Создать программу, определяющую делится ли это число без остатка на 3 или на 5.
Вывести результат на экран.

Пример 1:
int x = 4;
Вывод программы -> false

Пример 2:
int x = 50;
Вывод программы -> true
*/

public class Exercise3 {

    public static void main(String[] args) {
        int number = 15;
        System.out.println(divByFiveOrThree(number));
    }

    public static boolean divByFiveOrThree(int number) {
        return ((number % 5) == 0) || ((number % 3) == 0);
    }
}
