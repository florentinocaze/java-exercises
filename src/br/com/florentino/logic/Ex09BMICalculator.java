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

        System.out.println("De acordo com seu peso e altura, seu IMC corresponde a " + df.format(calcBMI) + ".");
    }
}
