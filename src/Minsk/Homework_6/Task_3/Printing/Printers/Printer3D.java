package Minsk.Homework_6.Task_3.Printing.Printers;

public class Printer3D extends Printer {

    private static final String PRINT_TEXT_FOR_3D_PRINTER = "На 3D принтере %s был напечатан следующий текст:\n%s";

    private int presenceOfPlastic;

    public Printer3D(String printerName) {
        super(printerName);
        presenceOfPlastic = 2;
    }

    @Override
    public boolean printText(String text) {
        if (isEmpty()){
            System.out.println("Закончился пластик, пожалуйста поставьте новую катушку!");
            return false;
        } else {
            System.out.println(String.format(PRINT_TEXT_FOR_3D_PRINTER, super.getPrinterName(), text));
            presenceOfPlastic--;
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return presenceOfPlastic == 0;
    }

    @Override
    public void refillPrinter() {
        presenceOfPlastic = 4;
    }

    @Override
    public String toString() {
        return "3D принтер: " + super.getPrinterName();
    }
}
