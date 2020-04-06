package lecture.week3.stringBuffer.excercise;

//Ввести текст. Постройте частотный словарь букв русского (или английского) алфавита.
// Вывести на экран количество каждой буквы.

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        int count;
        System.out.println("Введите текст для поиска:");
        text.append(scan.nextLine().toLowerCase());
        for (int i = 97; i < 123; i++) {
            count = searchSymbolInText((char)i, text);
            if (count > 0)
                System.out.println("В тексте " + count + " символов [" + (char)i + "].");
        }
    }

    public static int searchSymbolInText(char symbol, StringBuilder text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                result++;
            }
        }
        return result;
    }
}
