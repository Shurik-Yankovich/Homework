package lecture.theme2.operator.exercise;

/*
У нас есть громко говорящий попугай. Параметр hour является текущим часовым временем в диапазоне 0..23.
Мы в беде, если попугай разговаривает, до 7ч утра или после 20ч вечера.
Если у нас неприятности, вывести true.

Пример:
int hour = 22;
Вывод программы -> true
*/

public class Exercise5 {

    public static void main(String[] args) {
        int hour = 11;
        System.out.println(carrotSpeak(hour));
    }

    public static boolean carrotSpeak(int hour) {
        return (hour >= 0 && hour <= 7) || (hour >=20 && hour <= 23);
    }
}
