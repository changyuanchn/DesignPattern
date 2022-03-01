package com.changyuan.subjectDemo;

import com.changyuan.subjectDemo.CurrentConditionDisplay;
import com.changyuan.subjectDemo.WeatherData;

public class WeatherDataDemo1 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(50, 65, 30.4f);
        weatherData.setMeasurements(52, 70, 31.4f);
        weatherData.setMeasurements(58, 90, 32.4f);
    }
}
