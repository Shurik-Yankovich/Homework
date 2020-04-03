package lecture.week2.loop.exercise;

/*
Даны 2 числа. Напишите программу, чтобы найти значение одного числа, возведенного в степень другого.
Используйте цикл for.
*/

public class Exercise3For {
    public static void main(String[] args) {
        int number = 5;
        int exponent = 7;
        System.out.println("Число " + number + " в степени " + exponent +
                " равно " + exponentiation(number, exponent));
    }

    public static long exponentiation (int number, int exponent) {
        long result = 1L;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
}
