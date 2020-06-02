package Minsk.Homework_6.Task_3.Printing.Printers;

import Minsk.Homework_6.Task_3.Printing.Printing;

public abstract class Printer implements Printing {

    private String printerName;

    public Printer(String printerName) {
        this.printerName = printerName;
    }

    public String getPrinterName() {
        return printerName;
    }

    public abstract boolean isEmpty();

    public abstract void refillPrinter();
}
