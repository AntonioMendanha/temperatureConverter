package com.exercises;

import java.util.Scanner;

/**
 * Escreva um programa que com base em uma temperatura em graus celsius, converta e exiba em:
  * Considerar 2 casas decimais
 */
public class Main {

    public static void main(String[] args) {

        float factorConverter = 1.8f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius (C): ");
        float celsius = scan.nextFloat();

        System.out.printf("Foi coletado a temperatura de %.2fºC %n", celsius);
        //Kelvin (K)       -> formula: K = C + 273.15
        System.out.printf("C -> K = %.2fºC convertido em Kelvin é igual a %.2fºK %n",
                celsius, (celsius + 273.15)
        );
        //Réaumur (Re)     -> formula: Re = C * 0.8
        System.out.printf("C -> Re = %.2fºC convertido em Réamur é igual a %.2fºRe %n",
                celsius, (celsius * 0.8)
        );
        //Rankine (Ra)     -> formula: Ra = (C * 1.8) + 491
        System.out.printf("C -> Ra = %.2fºC convertido em Rankine é igual a %.2fºRa %n",
                celsius, ( (celsius * factorConverter) + 491)
        );
        //Farenheit (F)    -> formula: F = (C * 1.8) + 32
        System.out.printf("C -> F = %.2fºC convertido em Farenheit é igual a %.2fºF %n",
                celsius, ((celsius * factorConverter) + 32)
        );
    }

}
