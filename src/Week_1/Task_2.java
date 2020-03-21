package Week_1;

//Задача 2
//В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
//Создать программу, которая переставит числа в переменных таким образом,
//чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.

public class Task_2 {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 3;
        System.out.println(sortIncreasing(a, b, c));
    }

    public static String sortIncreasing (int a, int b, int c) {
        String result;
        if (a < b && a < c) {
            if (b < c)
                result = "Последовательность: " + a + ", " + b + ", " + c;
            else
                result = "Последовательность: " + a + ", " + c + ", " + b;
        } else if (b < a && b < c) {
            if (a < c)
                result = "Последовательность: " + b + ", " + a + ", " + c;
            else
                result = "Последовательность: " + b + ", " + c + ", " + a;
        } else {
            if (a < b)
                result = "Последовательность: " + c + ", " + a + ", " + b;
            else
                result = "Последовательность: " + c + ", " + b + ", " + a;
        }
        return result;
    }
}
