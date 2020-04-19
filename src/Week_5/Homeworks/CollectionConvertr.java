package Week_5.Homeworks;

//Задача 1
//Напишите обобщенный метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.


import java.util.*;

public class CollectionConvertr {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < 10; i ++) {
            list.add(random.nextInt(15));
            queue.add(random.nextInt(15));
        }

        System.out.println(list);
        System.out.println(duplicateRemoval(list));
        System.out.println();
        System.out.println(queue);
        System.out.println(duplicateRemoval(queue));
    }

    private static <T extends Comparable<T>> Set<T> duplicateRemoval(Collection<T> collection) {

//        Set<T> set = new HashSet<>();
//        for (T value : collection) {
//            set.add(value);
//        }
//        return set;
        return new HashSet<>(collection);
    }

}
