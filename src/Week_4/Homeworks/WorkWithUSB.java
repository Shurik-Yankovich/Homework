package Week_4.Homeworks;

public class WorkWithUSB {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.USBInterface usbInterface = computer.new USBInterface();
        Drive usbDrive = new USBDrive();
        Drive hardDiskDrive = new HardDiskDrive();

        usbInterface.putIn(usbDrive);
        if (!computer.writeData(usbDrive))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        if (!computer.printData(usbDrive))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");

        usbInterface.putIn(hardDiskDrive);
        usbInterface.putOut(usbDrive);
        usbInterface.putIn(hardDiskDrive);
        if (!computer.writeData(hardDiskDrive))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        if (!computer.printData(hardDiskDrive))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        usbInterface.putOut(hardDiskDrive);
    }
}
