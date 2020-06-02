package Minsk.Homework_6.Task_3.Printing.Monitors;

import Minsk.Homework_6.Task_3.Printing.Printing;

public class Monitor implements Printing {

    private static final String PRINT_TEXT_FOR_MONITOR = "На мониторе %s отобразился следующий текст:\n%s";

    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean printText(String text) {
        System.out.println(String.format(PRINT_TEXT_FOR_MONITOR, name, text));
        return true;
    }

    @Override
    public String toString() {
        return "Монитор: " + name;
    }
}
