package Minsk.Homeworks_5.Car_Catalog;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultChoice;
        Car[] catalog = new Car[11];
        catalog[0] = new TruckCar(2000, "КамАЗ 6520", 18500, 22.5);
        catalog[1] = new TruckCar(1995, "ГАЗ-САЗ-35122", 1250, 2.8);
        catalog[2] = new TruckCar(2014, "Mercedes-Benz Actros 2545 L BDF StreamSpace", 20000, 40);
        catalog[3] = new TruckCar(2008, "Mercedes-Benz Atego 818", 5000, 36);
        catalog[4] = new TruckCar(2003, "Hyundai HD 65 Duble Cub", 4000, 21);
        catalog[5] = new PassengerCar(2018, "Subaru Forester кроссовер", 4, 150);
        catalog[6] = new PassengerCar(2016, "Lexus LC купе", 2, 477);
        catalog[7] = new PassengerCar(2016, "Tesla Model S", 5, 772);
        catalog[8] = new PassengerCar(2003, "Dodge Viper купе", 2, 506);
        catalog[9] = new PassengerCar(2013, "Porsche Macan кроссовер", 5, 360);
        catalog[10] = new PassengerCar(2018, "Toyota Alphard минивэн", 8, 300);

        System.out.println("Выберите тип автомобиля:\n1 - грузовые\n2 - легковые");
        resultChoice = scanner.nextInt();
        switch (resultChoice) {
            case 1:
                for (Car car : catalog) {
                    if (car instanceof TruckCar)
                        car.aboutCar();
                }
                break;
            case 2:
                for (Car car : catalog) {
                    if (car instanceof PassengerCar)
                        car.aboutCar();
                }
                break;
            default:
                System.out.println("Неверно выбран пункт меню.");
        }
    }
}
