package Week_2.Homework;

//2 - Подсчет символов - пользователю предлагается ввести текст и символ для поиска.
// После этого на экран выводится количество символов в тексте

import java.util.Scanner;

public class CharacterCount {
    private String text;
    private char symbol;
    private int count = 0;

    public void symbolCount() {
        initializationText();
        initializationSymbol();
        countCharacterInText();
        System.out.println("В тексте найдено " + count + " символов: [" + symbol + "]\n");
    }

    private void initializationText() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите текст для поиска:");
        text = scan.nextLine();
    }

    private void initializationSymbol() {
        Scanner scan = new Scanner(System.in);
        String lineForSymbol;
        boolean condition = true;
        do {
            System.out.println("Введите символ, который нужно найти:");
            lineForSymbol = scan.nextLine();
            if (lineForSymbol.length() != 1) {
                System.out.println("Символ введен неверно! Пожалуйста введите один символ.");
            } else {
                symbol = lineForSymbol.charAt(0);
                condition = false;
            }
        } while (condition);
    }

    private void countCharacterInText() {

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol)
                count++;
        }
    }

}
