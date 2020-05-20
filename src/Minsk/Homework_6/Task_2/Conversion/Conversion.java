package Minsk.Homework_6.Task_2.Conversion;

import Minsk.Homework_6.Task_2.Temperature.Temperature;

public interface Conversion {

    Temperature conversionFromCelsius(Temperature temperature);

    Temperature conversionToCelsius(Temperature temperature);
}
