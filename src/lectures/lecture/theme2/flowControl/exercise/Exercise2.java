package lecture.theme2.flowControl.exercise;

/*
Даны 3 значения типа int - a b c, вернуть их сумму.
Однако, если одно из значений совпадает с другим из значений, оно не засчитывается в сумму.

Пример:
a = 1, b = 2, c = 3 → 6
a = 3, b = 2, c = 3 → 2
a = 3, b = 3, c = 3 → 0
*/

public class Exercise2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;
        int sum =sumWithoutRepeat(a,b,c);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + " -> " + sum);
    }

    public static int sumWithoutRepeat(int a, int b, int c) {
        int sum;
        if (a == b && a != c) {
            sum = c;
        } else if (a == c && a != b) {
            sum = b;
        } else if (b == c && a != b) {
            sum = a;
        } else if (a == b && a == c) {
            sum = 0;
        } else {
            sum = a + b + c;
        }
        return sum;
    }

}
