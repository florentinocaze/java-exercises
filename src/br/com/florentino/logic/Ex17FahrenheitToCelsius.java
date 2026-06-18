package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

// Leia temperatura em Fahrenheit e converta para Celsius.

public class Ex17FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.print("Insira o valor da temperatura em Fahrenheit (º F): ");
        double temperature = scanner.nextDouble();

        double fahrenheitToCelsius = (temperature - 32) / 1.8;

        System.out.println(temperature + "º F equivale a " + df.format(fahrenheitToCelsius) + "º C.");

        scanner.close();
    }
}
