package Week_4.Homeworks;

import java.util.Scanner;

public class Computer {

    private boolean status = false;

    public <T extends Drive> boolean readData(T drive){
        boolean result;
        if (status ) {
            result = drive.read();
        } else {
            result = false;
        }
        return result;
    }

    public <T extends Drive> boolean writeData(T drive) {
        boolean result;
        if (status) {
            Scanner scanner = new Scanner(System.in);
            String data;
            String type;
            System.out.println("Введите тип файла:");
            type = scanner.nextLine().toUpperCase();
            System.out.println("Введите данные для записи:");
            data = scanner.nextLine();
            result = drive.write(type, data);
        } else {
            result = false;
        }
        return result;
    }

    public class USBInterface {

        public void putIn(Drive drive) {
            if (!Computer.this.status) {
                if (drive != null) {
                    status = true;
                    drive.putOn();
                }
            } else
                System.out.println("USB слот уже занят!");
        }

        public void putOut(Drive drive) {
            if (drive != null) {
                Computer.this.status = false;
                drive.putOff();
            }
        }

    }
}
