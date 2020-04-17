package Week_5.Lectures.SetCollections;

//Создадим множество чисел(Set), занесем туда 20 различных чисел, а затем удалить из множества все числа больше 10.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Medium_1 {

    public static void main(String[] args) {
        Set<Integer> setNumbers = new HashSet<>();
        Random random = new Random(System.currentTimeMillis());
        int num;
        boolean status;

        for (int i = 0; i < 20; i ++) {
            do {
                status = true;
                num = random.nextInt(50);
                if (!setNumbers.contains(num)) {
                    setNumbers.add(num);
                    status = false;
                }
            } while (status);
        }

        System.out.println(setNumbers);

        Iterator<Integer> setIterator = setNumbers.iterator();
        while(setIterator.hasNext()) {
//            if (Integer.getInteger(setIterator.toString()) > 10)
//                setIterator.remove();
//            else
//                setIterator.next();
            if (setIterator.next() > 10)
                setIterator.remove();
        }

        System.out.println(setNumbers);
    }
}
