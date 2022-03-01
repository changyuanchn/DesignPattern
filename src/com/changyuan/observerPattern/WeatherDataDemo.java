package com.changyuan.observerPattern;

public class WeatherDataDemo {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 31.4f);
        weatherData.setMeasurements(78, 90, 32.4f);
    }
}
