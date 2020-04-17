package Week_5.Lectures.MapCollections;
//Создать Map с десятью строками. Ваша задача — вывести на экран список ключей,
// печатая каждый элемент с новой строки.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Easy_1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        int count = 1000000;

        for (int i = 0; i < count; i++) {
            map.put(i + 1, "Value" + (i  + 1));
        }

        long startTime = System.currentTimeMillis();
        for (Integer key : map.keySet()) {
            System.out.print(key + ": ");
            System.out.println(map.get(key));
        }
        long time1 = System.currentTimeMillis() - startTime;


        startTime = System.currentTimeMillis();
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        // Display the set.
        for (Map.Entry<Integer, String> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        long time2 = System.currentTimeMillis() - startTime;

        System.out.println(time1 + " : " + time2);
    }
}
