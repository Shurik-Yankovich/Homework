package lecture.theme2.operator.exercise;

/*
Создать любую положительную переменную х. Вывести на экран последнюю цифру этого числа.

Пример:
int x = 35;
Вывод программы -> 5
*/

public class Exercise1 {

    public static void main(String[] args) {
        int number = 29;
        System.out.println(divTen(number));
    }

    public static int divTen(int number) {
        return number % 10;
    }

}
