package Week_3.Week_4.Lectures;

public class WorkWithUSB {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.USBInterface usbInterface = computer.new USBInterface();
        USBData usbData1 = new USBData();
        USBData usbData2 = new USBData();

        usbInterface.putIn(usbData1);
        if (!computer.writeData(usbData1))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        if (!computer.printData(usbData1))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");

        usbInterface.putIn(usbData2);
        usbInterface.putOut(usbData1);
        usbInterface.putIn(usbData2);
        if (!computer.writeData(usbData2))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        if (!computer.printData(usbData2))
            System.out.println("Ошибка записи данных! Вставьте флешку в компьютер!");
        usbInterface.putOut(usbData2);
    }
}
