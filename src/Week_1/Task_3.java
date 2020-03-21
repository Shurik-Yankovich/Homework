package Week_1;

//Задача 3
//В две переменные a, b явно записаны программистом два числа.
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел.
//Например, среди чисел -8.5 и 11.45 ближайшее к десяти 11.45.

public class Task_3 {

    public static void main(String[] args) {
        double a = -7.7;
        double b = 13.2;
        System.out.println("Среди чисел " + a + " и " + b + ", число " + nearestNumberToTen(a, b) + " ближайшее к 10.");
    }

    public static double nearestNumberToTen (double first, double second) {
        return absoluteValueOfNumber(first - 10) < absoluteValueOfNumber(second - 10) ? first : second;
    }

    public static double absoluteValueOfNumber (double number) {
        return number >= 0 ? number : -number;
    }
}
