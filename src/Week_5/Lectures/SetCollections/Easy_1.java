package Week_5.Lectures.SetCollections;

//Создадим коллекцию Set с типом элементов String. А добавим в неё вот какие десять строк:
// арбуз, банан, вишня, груша, дыня, ежевика, женьшень, земляника, ирис, картофель.
// После этого выведем содержимое коллекции на экран, параллельно наблюдая за порядком добавленных.

import java.util.HashSet;
import java.util.Set;

public class Easy_1 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        System.out.println(set);
    }

}
