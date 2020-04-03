package lecture.theme2.flowControl.exercise;

/*
Вы едете слишком быстро, и полицейский останавливает вас.
Напишите код для вычисления результата, закодированный как значение типа int:
0 = нет штрафа, 1 = маленький штраф, 2 = большой штрафа.
Если скорость равна 60 или меньше, результат равен 0.
Если скорость находится между 61 и 80 включительно, результат равен 1.
Если скорость равна 81 или больше, результат равен 2.

Пример:
int speed = 100;
Вывод программы -> Большой штраф
*/

public class Exercise1 {

    public static void main(String[] args) {
        int speed = 100;
        System.out.println(speedPenalty(speed));
    }

    public static String speedPenalty(int speed) {
        String penalty;
        if (speed <= 60) {
            penalty = "Нет штрафа";
        } else if (speed >= 81) {
            penalty = "Большой штраф";
        } else {
            penalty = "Маленький штраф";
        }
        return penalty;

    }


}
