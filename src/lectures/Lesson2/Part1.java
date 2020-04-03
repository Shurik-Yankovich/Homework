package Lesson2;

public class Part1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        boolean res = (a>b)&&(++b == c);
        System.out.println(res);
        System.out.println(a + " " + b + " " + c);
    }
}
