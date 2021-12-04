package com.exercises.service;

public class TemperatureConverter {

    static float factorConverter = 1.8f;

    public static float celsiusToKelvin(float temperature) {
        return temperature + 273.15f;
    }

    public static float celsiusToReamur(float temperature) {
        return temperature * 0.8f;
    }

    public static float celsiusToRankine(float temperature) {
        return (temperature * factorConverter) + 491f;
    }

    public static float celsiusToFarenheint(float temperature) {
        return (temperature * factorConverter) + 32f;
    }
}
