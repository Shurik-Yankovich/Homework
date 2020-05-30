package Minsk.Homework_8;

import java.util.function.Function;

public class MyComparator {

    private String string;

    public MyComparator(String string) {
        this.string = string;
    }

    public int foo(Function<String, Integer> function) {
        return function.apply(string);
    }
}
