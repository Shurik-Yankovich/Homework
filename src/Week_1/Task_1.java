package Week_1;
//Задача 1:
//В переменную a явно записано программистом случайное число.
//Создать программу, которая будет проверять попало ли это число в интервал (25;100)
//и сообщать результат на экран.

public class Task_1 {

    public static void main(String[] args) {
        int a = 40;
        System.out.println(belongsToTheInterval(a));
    }

    public static String belongsToTheInterval (int number) {
        return number >= 25 && number <= 100 ? "Число " + number + " принадлежит интервалу (25;100)"
                : "Число " + number + " не принадлежит интервалу (25;100)";
    }

}
