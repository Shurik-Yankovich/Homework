package Week_4.Homeworks;

public class WorkWithUSB {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.USBInterface usbInterface = computer.new USBInterface();
        USBDrive usbDrive = new USBDrive();
        HardDiskDrive hardDiskDrive = new HardDiskDrive();

        usbInterface.putIn(usbDrive);
        work(computer, usbDrive);

        usbInterface.putIn(hardDiskDrive);
        usbInterface.putOut(usbDrive);

        usbInterface.putIn(hardDiskDrive);
        work(computer, hardDiskDrive);
        usbInterface.putOut(hardDiskDrive);

    }

    public static void work(Computer computer, Drive drive){
        if (!computer.writeData(drive))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        if (!computer.readData(drive))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
    }
}
