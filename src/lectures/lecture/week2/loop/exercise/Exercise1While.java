package lecture.week2.loop.exercise;

/*
Напишите программу для суммирования  чисел от 1 до 100, которые делятся на 7.
Выведите сумму. Используйте цикл while.
*/

public class Exercise1While {

    public static void main(String[] args) {
        System.out.println("Сумма чисел, кратных 7 в диапазоне [1;100], равна " + sumNumberMultipleSeven());
    }

    public static int sumNumberMultipleSeven() {
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            if (number % 7 == 0)
                sum += number;
            number ++;
        }
        return sum;
    }
}
