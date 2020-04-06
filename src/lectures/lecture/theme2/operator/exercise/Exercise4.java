package lecture.theme2.operator.exercise;

/*
Дан возраст. Создать программу, определяющую входит ли возраст в диапазон от 12 до 18.
Вывести результат на экран.

Пример:
int age = 4;
Вывод программы -> false
*/

public class Exercise4 {

    public static void main(String[] args) {
        int age = 20;
        System.out.println(isAgeAppropriate(age));
    }

    public static boolean isAgeAppropriate(int age) {
        return age >= 12 && age <= 18;
    }
}
