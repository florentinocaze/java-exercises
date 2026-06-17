package br.com.florentino.logic;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calcule o salário líquido do professor com desconto de INSS.
 */

public class Ex22TeacherNetSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira o valor da hora aula em reais (R$): ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Insira a quantidade de aulas lecionadas no mês: ");
        int monthlyClassCount = scanner.nextInt();
        System.out.print("Insira o percentual (%) de desconto do INSS: ");
        double inssDiscountRate = scanner.nextDouble();

        double grossSalary = hourlyRate * monthlyClassCount;
        double inssDiscount = grossSalary * inssDiscountRate / 100;
        double netSalary = grossSalary - inssDiscount;

        System.out.println("Salário bruto: R$" + df.format(grossSalary) + ".");
        System.out.println("Salário líquido: R$" + df.format(netSalary) + ".");

        scanner.close();
    }
}
