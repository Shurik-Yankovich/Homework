package lecture.theme2.flowControl.exercise;

/*
Дано число. Написать код, который:
- выводит на экран строку "Число меньше 5", если число меньше 5,
- выводит строку "Число больше 5", если число больше 5,
- выводит строку "Число равно 5", если число равен 5.
*/

public class Exercise3 {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(numberCompareWithFive(number));
    }

    public static String numberCompareWithFive(int number) {
        String result;
        if (number < 5)
            result = "Число меньше 5";
        else if (number == 5)
            result = "Число равно 5";
        else
            result = "Число больше 5";
        return result;
    }

}
