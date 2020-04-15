package Week_5.Lectures.ListCollections;

//Введите 5 слов, поместите их в список. Удалите третий элемент списка,
// и выводите оставшиеся элементы в обратном порядке.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Easy_1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пять слов:");
        for (int i = 0; i < 5; i ++) {
            list.add(scanner.nextLine());
        }

        list.remove(3);

        System.out.println("Полученный список:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size()-1-i));
        }

    }
}
