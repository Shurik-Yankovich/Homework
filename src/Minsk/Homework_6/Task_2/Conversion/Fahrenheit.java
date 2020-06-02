package Minsk.Homework_6.Task_2.Conversion;

import Minsk.Homework_6.Task_2.Temperature.Temperature;

import static Minsk.Homework_6.Task_2.Temperature.TemperatureMeasure.*;

public class Fahrenheit implements Conversion {
    @Override
    public Temperature conversionFromCelsius(Temperature temperature) {
        if (temperature.getMeasure() == CELSIUS) {
            double newTemperature = temperature.getTemperature() * 9 / 5 + 32;
            temperature.setTemperature(newTemperature);
            temperature.setMeasure(FAHRENHEIT);
        } else if (temperature.getMeasure() == KELVIN) {
            System.out.println("Попытка неправильно провести конвертацию! Сначала приведите температуру к Цельсиям.");
        }
        return temperature;
    }

    @Override
    public Temperature conversionToCelsius(Temperature temperature) {
        if (temperature.getMeasure() == FAHRENHEIT) {
            double newTemperature = (temperature.getTemperature() - 32) * 5 / 9;
            temperature.setTemperature(newTemperature);
            temperature.setMeasure(CELSIUS);
        } else if (temperature.getMeasure() == KELVIN) {
            System.out.println("Неверно выбран класс для работы с температурой! Пожалуйста выберите класс для работы с Кельвинами.");
        }
        return temperature;
    }
}
