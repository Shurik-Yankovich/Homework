package Minsk.Homework_6.Task_2;

//Написать конвертер температуры из градусов Цельсия в Фаренгейты или Кельвины.
//Выбор должен происходиь посрестом выбора нужной конвертации в меню.
//Градусы могут иметь дробную часть (например, 36.6 градусов).

import Minsk.Homework_6.Task_2.Conversion.Conversion;
import Minsk.Homework_6.Task_2.Conversion.Fahrenheit;
import Minsk.Homework_6.Task_2.Conversion.Kelvin;
import Minsk.Homework_6.Task_2.Temperature.Temperature;

import java.util.Scanner;

import static Minsk.Homework_6.Task_2.Temperature.TemperatureMeasure.CELSIUS;

public class Menu {

    private static final int WORK_WITH_FAHRENHEIT = 1;
    private static final int WORK_WITH_KELVIN = 2;
    private static final int EXIT = 3;
    private static final String ERROR_TEXT = "Неверно выбран пункт меню!";

    Scanner scanner;

    public static void main(String[] args) {
        new Menu().start();
    }

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        Temperature temperature;
        Conversion conversion;
        temperature = getTemperature();
        while (true) {
            conversion = mainMenu();
            System.out.println(changeTemperatureMeasure(conversion, temperature));
        }
    }

    private Temperature getTemperature() {
        double temperature;
        System.out.println("Введите темепературу в цельсих:");
        temperature = scanner.nextDouble();
        return new Temperature(temperature, CELSIUS);
    }

    private Conversion mainMenu() {
        do {
            System.out.println("Выберите пункт меню:\n1 - Работа с Фаренгейтами\n2 - Работа с Кельвинами\n3 - Выход");
            switch (scanner.nextInt()) {
                case WORK_WITH_FAHRENHEIT:
                    return new Fahrenheit();
                case WORK_WITH_KELVIN:
                    return new Kelvin();
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println(ERROR_TEXT);
            }
        } while (true);
    }

    public Temperature changeTemperatureMeasure(Conversion conversion, Temperature temperature) {
        while (true) {
            System.out.println("Выберите пункт меню:\n1 - Конвертировать из Цельсиев\n2 - Конвертировать в Цельсии");
            switch (scanner.nextInt()) {
                case 1:
                    return conversion.conversionFromCelsius(temperature);
                case 2:
                    return conversion.conversionToCelsius(temperature);
                default:
                    System.out.println(ERROR_TEXT);
            }
        }
    }
}

