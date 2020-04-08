package Week_3.Week_4.Lectures;

import java.util.Scanner;

public class Computer {

    private boolean status = false;

    public boolean printData(USBData usbData){
        boolean result;
        if (status && usbData.status) {
            switch (usbData.dataType) {
                case MOVIE:
                    System.out.println("Воспроизводится фильм с названием: " + usbData.getData());
                    break;
                case AUDIO:
                    System.out.println("Воспроизводится аудио с названием: " + usbData.getData());
                    break;
                case FILE:
                    System.out.println("Файл содержит: " + usbData.getData());
                    break;
            }
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean writeData(USBData usbData) {
        boolean result;
        if (status && usbData.status) {
            Scanner scanner = new Scanner(System.in);
            String data;
            String type;
            System.out.println("Введите тип файла:");
            type = scanner.nextLine().toUpperCase();
            System.out.println("Введите данные для записи:");
            data = scanner.nextLine();
            usbData.setData(type, data);
            result = true;
        } else {
            result = false;
        }
        return result;
    }

//    private String getDataFromKB() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите данные для записи:");
//        return scanner.nextLine();
//    }

    public class USBInterface {

        public void putIn(USBData usbData) {
            if (!Computer.this.status) {
                status = true;
                usbData.status = true;
            } else
                System.out.println("USB слот уже занят!");
        }

        public void putOut(USBData usbData) {
            Computer.this.status = false;
            usbData.status = false;
        }

    }
}
