package Minsk.Homework_6.Task_3;

import Minsk.Homework_6.Task_3.Printing.Monitors.AdvertisingDisplay;
import Minsk.Homework_6.Task_3.Printing.Monitors.Monitor;
import Minsk.Homework_6.Task_3.Printing.Printers.LaserPrinter;
import Minsk.Homework_6.Task_3.Printing.Printers.MatrixPrinter;
import Minsk.Homework_6.Task_3.Printing.Printers.Printer;
import Minsk.Homework_6.Task_3.Printing.Printers.Printer3D;
import Minsk.Homework_6.Task_3.Printing.Printing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final String TEXT_FOR_REFILL_PRINTER = "Выберите пункт меню:\n1 - Заправить принтер\n2 - Выбрать другое устройство\n3 - Выйти из программы";
    private static final String TEXT_FOR_CHOICE_DEVICES = "Напечатать новое сообщение:\n1 - На том же устройсте\n2 - Выбрать другое устройство\n3 - Выйти из программы";
    private static final int WORK_WITH_THE_SAME_DEVICE = 1;
    private static final int WORK_WITH_NEW_DEVICE = 2;
    private static final int EXIT = 3;

    private Scanner scanner;
    private List<Printing> devicesList;

    public Menu() {
        this.scanner = new Scanner(System.in);
        devicesList = new ArrayList<>();
    }

    public void startMenu() {
        setPrintingDevices();
        while (workWithDevices() == WORK_WITH_NEW_DEVICE) ;
    }

    private void setPrintingDevices() {
        devicesList.add(new Monitor("ASUS XG27VQ"));
        devicesList.add(new Monitor("Samsung C24RG50FQI"));
        devicesList.add(new AdvertisingDisplay("Philips BDL4830QL"));
        devicesList.add(new Printer3D("Wanhao Duplicator i3 Mini"));
        devicesList.add(new LaserPrinter("Canon i-SENSYS MF3010"));
        devicesList.add(new LaserPrinter("Kyocera Mita ECOSYS M2235dn"));
        devicesList.add(new MatrixPrinter("Epson LX-350"));
    }

    private int workWithDevices() {
        String text;
        int deviceNumber;
        int choiceNumber = WORK_WITH_THE_SAME_DEVICE;

        deviceNumber = choiceDevices();
        do {
            if (choiceNumber == WORK_WITH_THE_SAME_DEVICE) {
                text = writeText();
                deviceWork(deviceNumber, text);
            }
            System.out.println(TEXT_FOR_CHOICE_DEVICES);
            choiceNumber = readIntFromConsole();
            switch (choiceNumber) {
                case WORK_WITH_THE_SAME_DEVICE:
                    break;
                case WORK_WITH_NEW_DEVICE:
                    return choiceNumber;
                case EXIT:
                    System.exit(1);
                default:
                    System.out.println("Неверно выбран пункт меню!");
            }
        } while (true);
    }

    private int choiceDevices() {
        int deviceNumber;

        do {
            System.out.println("Выберите устройства из списка:");
            printPrintingDevices();
            deviceNumber = readIntFromConsole();
        } while (deviceNumber < 0 || deviceNumber >= devicesList.size());

        return deviceNumber;
    }

    private void printPrintingDevices() {
        for (int i = 0; i < devicesList.size(); i++) {
            System.out.println(i + " - " + devicesList.get(i));
        }
    }

    private String writeText() {
        System.out.println("Введите текст:");
        scanner.nextLine();
        return scanner.nextLine();
    }

    private void deviceWork(int deviceNumber, String text) {
        boolean isPrinting;
        int choiceNumber;
        Printing device = devicesList.get(deviceNumber);

        isPrinting = device.printText(text);
        if (!isPrinting) {
            while (true) {
                System.out.println(TEXT_FOR_REFILL_PRINTER);
                choiceNumber = readIntFromConsole();
                switch (choiceNumber) {
                    case WORK_WITH_THE_SAME_DEVICE:
                        ((Printer) device).refillPrinter();
                        deviceWork(deviceNumber, text);
                        return;
                    case WORK_WITH_NEW_DEVICE:
                        deviceWork(choiceDevices(), text);
                        return;
                    case EXIT:
                        System.exit(1);
                    default:
                        System.out.println("Неверно выбран пункт меню!");
                }
            }
        }
    }

    private int readIntFromConsole() {
        return scanner.nextInt();
    }
}
