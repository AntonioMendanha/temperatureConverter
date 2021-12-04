package com.exercises;

import com.exercises.service.TemperatureConverter;

import java.util.Scanner;

/**
 * Escreva um programa que com base em uma temperatura em graus celsius, converta e exiba em:
  * Considerar 2 casas decimais
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a temperatura em Celsius (C): ");
        float celsius = scan.nextFloat();

        System.out.printf("Foi coletado a temperatura de %.2fºC %n", celsius);

        System.out.printf("C -> K = %.2fºC convertido em Kelvin é igual a %.2fºK %n",
                celsius, TemperatureConverter.celsiusToKelvin(celsius)
        );

        System.out.printf("C -> Re = %.2fºC convertido em Réamur é igual a %.2fºRe %n",
                celsius, TemperatureConverter.celsiusToReamur(celsius)
        );

        System.out.printf("C -> Ra = %.2fºC convertido em Rankine é igual a %.2fºRa %n",
                celsius, TemperatureConverter.celsiusToRankine(celsius)
        );

        System.out.printf("C -> F = %.2fºC convertido em Farenheit é igual a %.2fºF %n",
                celsius, TemperatureConverter.celsiusToFarenheint(celsius)
        );
    }

}
