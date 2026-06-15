package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Leia peso e altura. Calcule o IMC e exiba a condição correspondente.
 */

public class Ex09BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira seu peso em quilogramas: ");
        double weight = scanner.nextDouble();
        System.out.print("Insira sua altura em metros: ");
        double height = scanner.nextDouble();

        double calcBMI = weight / (height * height);

        System.out.print("De acordo com seu peso e altura, seu IMC corresponde a " + df.format(calcBMI) + ". Segundo a OMS, esta faixa ");

        if (calcBMI > 0 && calcBMI < 18.5) {
            System.out.println("é classificada como abaixo do peso normal.");
        } else if (calcBMI >= 18.5 && calcBMI <= 24.9) {
            System.out.println("é classificada como peso normal.");
        } else if (calcBMI >= 25 && calcBMI <= 29.9) {
            System.out.println("é classificada como excesso de peso.");
        } else if (calcBMI >= 30 && calcBMI <= 34.9) {
            System.out.println("é classificada como Obesidade classe I.");
        } else if (calcBMI >= 35 && calcBMI <= 39.9) {
            System.out.println("é classificada como Obesidade classe II.");
        } else if (calcBMI >= 40) {
            System.out.println("é classificada como Obesidade classe III.");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
