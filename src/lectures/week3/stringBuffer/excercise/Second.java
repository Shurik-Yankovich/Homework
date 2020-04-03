package lecture.week3.stringBuffer.excercise;

//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        System.out.println("Введите слова для поиска:");
        text.append(scan.nextLine());
        System.out.println("Слово, в котором число различных символов минимально: " +
                searchShortWord(text));
    }

    public static StringBuilder searchShortWord(StringBuilder text) {
        StringBuilder shortWord = new StringBuilder();
        StringBuilder substrinOfText = new StringBuilder();
        int numberOfSpace = text.indexOf(" ");
        if (numberOfSpace > 0) {
            shortWord.append(text.substring(0, numberOfSpace));
            text.delete(0, numberOfSpace);
            numberOfSpace = text.indexOf(" ");
            while (numberOfSpace > 0) {
                substrinOfText.replace(0, substrinOfText.length(), text.substring(0, numberOfSpace));
                if (numberOfNonRepeatingCharacters(shortWord) > numberOfNonRepeatingCharacters(substrinOfText)) {
                    shortWord.replace(0, shortWord.length(), substrinOfText.toString());
                    text.delete(0, numberOfSpace);
                }
                numberOfSpace = text.indexOf(" ");
            }
//            if (numberOfNonRepeatingCharacters(shortWord) > numberOfNonRepeatingCharacters(text) && text.length()>0) {
//                return text;
//            }
            return shortWord;
        }
        else
            return text;
    }

    public static int numberOfNonRepeatingCharacters(StringBuilder word) {
        int count = 0;
        StringBuilder[] alphabet = new StringBuilder [26];
        for (int i = 0; i < 26; i++) {
            alphabet[i].append((char)(97+i));
        }
        for (int i = 0; i < 26; i++) {
            if (word.indexOf(alphabet[i].toString()) > 0) {
                count++;
            }
        }
        return count;
    }
}
