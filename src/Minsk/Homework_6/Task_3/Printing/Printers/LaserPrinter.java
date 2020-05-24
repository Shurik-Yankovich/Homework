package Minsk.Homework_6.Task_3.Printing.Printers;

public class LaserPrinter extends Printer {

    private static final String PRINT_TEXT_FOR_LASER_PRINTER = "На лазерном принтере %s был напечатан следующий текст:\n%s";

    private int printerCartridge;

    public LaserPrinter(String printerName) {
        super(printerName);
        printerCartridge = 4;
    }

    @Override
    public boolean printText(String text) {
        if (isEmpty()){
            System.out.println("В картридже закончилась краска. Пожалуйста заправьте картридж!");
            return false;
        } else {
            System.out.println(String.format(PRINT_TEXT_FOR_LASER_PRINTER, super.getPrinterName(), text));
            printerCartridge--;
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return printerCartridge == 0;
    }

    @Override
    public void refillPrinter() {
        printerCartridge = 8;
    }

    @Override
    public String toString() {
        return "Лазерный принтер: " + super.getPrinterName();
    }
}
