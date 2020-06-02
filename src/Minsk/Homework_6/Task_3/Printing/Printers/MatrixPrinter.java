package Minsk.Homework_6.Task_3.Printing.Printers;

public class MatrixPrinter extends Printer {

    private static final String PRINT_TEXT_FOR_MATRIX_PRINTER = "На матричном принтере %s был напечатан следующий текст:\n%s";

    private int matrixPrinterCartridge;

    public MatrixPrinter(String printerName) {
        super(printerName);
        matrixPrinterCartridge = 0;
    }

    @Override
    public boolean printText(String text) {
        if (isEmpty()){
            System.out.println("В картридже закончилась краска. Пожалуйста замените картридж!");
            return false;
        } else {
            System.out.println(String.format(PRINT_TEXT_FOR_MATRIX_PRINTER, super.getPrinterName(), text));
            matrixPrinterCartridge--;
            return true;
        }
    }

    @Override
    public boolean isEmpty() {
        return matrixPrinterCartridge == 0;
    }

    @Override
    public void refillPrinter() {
        matrixPrinterCartridge = 2;
    }

    @Override
    public String toString() {
        return "Матричный принтер: " + super.getPrinterName();
    }
}
