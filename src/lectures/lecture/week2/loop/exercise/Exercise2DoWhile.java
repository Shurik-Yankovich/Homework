package lecture.week2.loop.exercise;

/*
Напишите программу для рассчета произведения чисел от 1 до 10.
Используйте цикл do while.
*/

public class Exercise2DoWhile {
    public static void main(String[] args) {
        System.out.println("Произведение чисел от 1 до 10 равна " + multiplicationNumber());
    }

    public static int multiplicationNumber() {
        int multiplication = 1;
        int number = 1;
        do {
            multiplication *= number;
            number++;
        } while (number <= 10);
        return multiplication;
    }
}
