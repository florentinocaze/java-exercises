package br.com.florentino.oop.ex06abstractemployee;

/*
Crie a classe abstrata Employee com atributos nome e salário base, e o método abstrato calculateSalary().
Implemente as subclasses Manager (com bônus fixo) e Salesperson (com comissão percentual sobre vendas).
No Main, demonstre o cálculo de salário de cada tipo.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do gerente: ");
        String managerName = scanner.nextLine();

        System.out.print("Digite o salário do gerente: ");
        double managerSalary = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Digite o nome do vendedor: ");
        String salespersonName = scanner.nextLine();

        System.out.print("Digite o salário do vendedor: ");
        double salespersonSalary = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas: ");
        double salespersonSales = scanner.nextDouble();

        Manager manager = new Manager(managerName, managerSalary);
        Salesperson salesperson = new Salesperson(salespersonName, salespersonSalary, salespersonSales);

        System.out.println("Gerente: " + manager.getName());
        System.out.println("Salário total com bônus: R$" + decimalFormat.format(manager.calculateSalary()));

        System.out.println("Vendedor: " + salesperson.getName());
        System.out.println("Salário total com bônus: R$" + decimalFormat.format(salesperson.calculateSalary()));

        scanner.close();
    }
}
