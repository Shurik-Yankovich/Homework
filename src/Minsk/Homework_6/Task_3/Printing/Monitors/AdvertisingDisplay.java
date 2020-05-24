package Minsk.Homework_6.Task_3.Printing.Monitors;

public class AdvertisingDisplay extends Monitor {

    private static final String PRINT_TEXT_FOR_DISPLAY = "Следующий текст отобразился на рекламном дисплее %s:\n%s";

    public AdvertisingDisplay(String name) {
        super(name);
    }

    @Override
    public boolean printText(String text) {
        System.out.println(String.format(PRINT_TEXT_FOR_DISPLAY, super.getName(), text));
        return true;
    }

    @Override
    public String toString() {
        return "Рекламный дисплей: " + super.getName();
    }
}
