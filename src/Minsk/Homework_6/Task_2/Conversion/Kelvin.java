package Minsk.Homework_6.Task_2.Conversion;


import Minsk.Homework_6.Task_2.Temperature.Temperature;

import static Minsk.Homework_6.Task_2.Temperature.TemperatureMeasure.*;

public class Kelvin implements Conversion {
    @Override
    public Temperature conversionFromCelsius(Temperature temperature) {
        if (temperature.getMeasure() == CELSIUS) {
            double newTemperature = temperature.getTemperature() + 273.15;
            temperature.setTemperature(newTemperature);
            temperature.setMeasure(KELVIN);
        } else if (temperature.getMeasure() == FAHRENHEIT) {
            System.out.println("Попытка неправильно провести конвертацию! Сначала приведите температуру к Цельсиям.");
        }
        return temperature;
    }

    @Override
    public Temperature conversionToCelsius(Temperature temperature) {
        if (temperature.getMeasure() == KELVIN) {
            double newTemperature = temperature.getTemperature() - 273.15;
            temperature.setTemperature(newTemperature);
            temperature.setMeasure(CELSIUS);
        } else if (temperature.getMeasure() == FAHRENHEIT) {
            System.out.println("Неверно выбран класс для работы с температурой! Пожалуйста выберите класс для работы с Фаренгейтами.");
        }
        return temperature;
    }
}
