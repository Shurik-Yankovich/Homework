package lecture.theme2.flowControl.exercise;

/*
Даны 2 переменные: количество сигар и день недели.
Когда белки собираются на вечеринку, им нравится курить сигары.
Белковая вечеринка успешна, когда количество сигар от 40 до 60 включительно.
Но если вечеринка проходит на выходных, предела количеству сигар нет.
Вывести на экран, довольны ли белки вечеринкой.
Использовать тернарный оператор.

Пример:
int day = 1; //Понедельник
int cigarCount = 50; //Количество сигар
Вывод программы -> Довольны!
*/

public class Exercise4 {

    public static void main(String[] args) {
        int countCigar = 80;
        int day = 7;
        System.out.println(party(countCigar,day));
    }

    public static String party (int countCigar, int day) {
        String result;
        result = (day >= 6 || countCigar <= 60) && countCigar >= 40 ? "Довольны!" : "Недовольны!";
        return result;
    }

}
