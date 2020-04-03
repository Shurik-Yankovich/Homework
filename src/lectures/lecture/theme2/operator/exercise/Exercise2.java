package lecture.theme2.operator.exercise;

/*
Даны 2 положительных числа. Создать программу, определяющую равны ли последние цифры этих чисел.
Вывести результат на экран.

Пример:
int x = 55;
int y = 15
Вывод программы -> true
*/

public class Exercise2 {

    public static void main(String[] args) {
        int firstNumber = 17;
        int secondNumber = 99;
        System.out.println(lastDigitComparison(firstNumber,secondNumber));
    }

    public static boolean lastDigitComparison(int firstNumber, int secondNumber) {
        return (firstNumber % 10) == (secondNumber % 10);
    }

}
