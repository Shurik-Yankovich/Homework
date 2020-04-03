package Lesson1;

public class Main {

    public static void printCountLines(int count) {
        for(int i=0; i<count; i++) {
            System.out.println("Я начинаю изучать Java!");
        }
    }

    public static void printCalculate() {
        int i = 3;
        int j = 4;
        int k = i * i + j * j;
        System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);
    }

    public static void printParityNumber(int number) {
        if (number % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }


    public static void main(String[] args) {
//        Main.printCountLines(5);
//        Main.printCalculate();
        Main.printParityNumber(5);
    }

}
