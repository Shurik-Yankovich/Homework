package Minsk.Homework_7.Task_5;

//Реализовать свой собственный односвязный список и операцию добавления элемента в список по индексу и операцию получения элемента списка по индексу

import Minsk.Homework_7.Task_5.MyList.MyList;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        MyList<String> myList1 = new MyList<>();
        int countNumbers;
        int index;
        Random random = new Random(System.currentTimeMillis());
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов списка:");
        countNumbers = scanner.nextInt();
        for (int i = 0; i < countNumbers; i++) {
            myList.add(random.nextInt(countNumbers * 10));
        }

        System.out.println(myList);

        System.out.println("Введите индекс нужного элемента:");
        index = scanner.nextInt();
        System.out.println(String.format("По индексу %d лежит элемент [%d]", index, myList.get(index)));

        myList1.add("Мама");
        myList1.add("мыла");
        myList1.add("раму");
        myList1.add("а");
        myList1.add("Рома");
        myList1.add("мыл");
        myList1.add("окно");

        System.out.println(myList1);
        System.out.println(String.format("Четвертый элемент: %s", myList1.get(4)));


    }
}
