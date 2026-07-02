package br.com.florentino.syntax;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Refatore os exercícios de IMC e média usando métodos com parâmetros e retorno.

public class Ex09MethodsWithReturn {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um exercício:");
        System.out.println("1. Cálculo de IMC");
        System.out.println("2. Média de três notas");
        System.out.println("3. Aprovação de aluno (média de quatro notas)");
        System.out.print("Opção: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> runBMICalculator(scanner, decimalFormat);
            case 2 -> runAverageThreeGrades(scanner, decimalFormat);
            case 3 -> runStudentApproval(scanner, decimalFormat);
            default -> System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    private static void runBMICalculator(Scanner scanner, DecimalFormat decimalFormat) {
        System.out.print("Digite sua altura (m): ");
        double height = scanner.nextDouble();

        System.out.print("Digite seu peso (kg): ");
        double weight = scanner.nextDouble();

        double bmi = calculateBMI(height, weight);
        System.out.println("IMC: " + decimalFormat.format(bmi) + ".");

        String classification = classifyBMI(bmi);
        System.out.println(classification);
    }

    private static void runAverageThreeGrades(Scanner scanner, DecimalFormat decimalFormat) {
        double[] grades = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double average = calculateAverage(grades);

        System.out.println("Média: " + decimalFormat.format(average) + ".");
    }

    private static void runStudentApproval(Scanner scanner, DecimalFormat decimalFormat) {
        double[] grades = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double average = calculateAverage(grades);

        System.out.println("Média: " + decimalFormat.format(average) + ".");

        if (average >= 7) {
            System.out.println("Situação: Aprovado.");
        } else {
            System.out.println("Situação: Reprovado.");
        }
    }
    
    private static double calculateBMI(double height, double weight) {
        if (height > 0 && weight > 0) {
            return weight / (height * height);
        } else {
            System.out.println("Valores inválidos.");
            return 0;
        }
    }
    
    private static String classifyBMI(double bmi) {
        if (bmi > 0 && bmi < 18.5) {
            return "Classificação: Abaixo do peso normal.";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Classificação: peso normal.";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Classificação: excesso de peso.";
        } else if (bmi >= 30 && bmi <= 34.9) {
            return "Classificação: Obesidade classe I.";
        } else if (bmi >= 35 && bmi <= 39.9) {
            return "Classificação: Obesidade classe II.";
        } else if (bmi >= 40) {
            return "Classificação: Obesidade classe III.";
        } else {
            return "IMC inválido.";
        }
    }

    private static double calculateAverage(double... grades) {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }
}
