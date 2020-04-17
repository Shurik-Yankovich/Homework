package Week_5.Lectures.ListCollections;

//Давайте измерим, сколько времени занимает 10 тысяч вставок для списков LinkedList и ArrayList.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Easy_2 {

    static final int count = 10000000;

    public static void main(String[] args) {
        Easy_2.arrayListTiming();
        Easy_2.linkedListTiming();
    }

    public static void arrayListTiming() {
        List<Integer> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(1);
        }
        long time = System.currentTimeMillis() - startTime;
        System.out.println("Время вставки " + count + " элементов в ArrayList занимает: " + time + "мс");
    }

    public static void linkedListTiming() {
        List<Integer> list = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(1);
        }
        long time = System.currentTimeMillis() - startTime;
        System.out.println("Время вставки " + count + " элементов в LinkedList занимает: " + time + "мс");
    }

}
