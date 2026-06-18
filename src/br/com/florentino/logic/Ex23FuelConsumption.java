package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

// Calcule litros gastos em viagem dado tempo e velocidade média.

public class Ex23FuelConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe o tempo da viagem em horas: ");
        int travelTime = scanner.nextInt();

        System.out.print("Informe a velocidade média em km/h: ");
        int averageSpeed = scanner.nextInt();

        int distanceTraveled = travelTime * averageSpeed;
        int kmPerLiter = 12;

        double fuelConsumption = (double) distanceTraveled / kmPerLiter;

        System.out.println("A distância percorrida na viagem é de " + distanceTraveled + " km, acarretando o consumo de " + df.format(fuelConsumption) + " litros.");

        scanner.close();
    }
}
