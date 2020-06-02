package Minsk.Homework_6.Task_2.Temperature;

public class Temperature {

    private double temperature;
    private TemperatureMeasure measure;

    public Temperature(double temperature, TemperatureMeasure measure) {
        this.temperature = temperature;
        this.measure = measure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TemperatureMeasure getMeasure() {
        return measure;
    }

    public void setMeasure(TemperatureMeasure measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        String text = String.format("Температура: %.2f ° ", temperature);
        return text + measure;
    }
}
