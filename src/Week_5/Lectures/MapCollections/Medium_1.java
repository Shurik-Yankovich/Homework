package Week_5.Lectures.MapCollections;

//Создать словарь типа «фамилия»-«зарплата» и удалить из него тех, у кого зарплата ниже 500 кредитов.

import java.util.*;

public class Medium_1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(System.currentTimeMillis());
        System.out.println("Введите данные:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Фамилия: ");
            String name = scanner.nextLine();
            Integer money = random.nextInt(1000);
            map.put(name, money);
        }

        System.out.println(map);

        Set<String> keys = new HashSet<>();
        for (String key : map.keySet()) {
            if (map.get(key) < 500) {
                keys.add(key);
            }
        }

        for (String key : keys) {
            map.remove(key);
        }

//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//
//        // Display the set.
//        for (Map.Entry<String, Integer> me : set) {
//            if (me.getValue() < 500)
//                map.remove(me.getKey());
//        }

        System.out.println(map);
    }
}
