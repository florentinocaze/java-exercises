package br.com.florentino.oop.ex02bankaccountencapsulation;

/*
Crie a classe BankAccount com saldo encapsulado (atributo private).
Implemente os métodos deposit(), withdraw() e getBalance(), com validação para impedir
saque acima do saldo disponível e depósitos negativos. No Main, demonstre as operações.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        while (true) {
            System.out.println("--- Conta Bancária ---");

            System.out.println("Funções:");
            System.out.println("1. Sacar dinheiro;");
            System.out.println("2. Depositar dinheiro;");
            System.out.println("3. Verificar saldo da conta.");
            System.out.println("4. Sair.");

            System.out.print("Selecione uma das opções: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.print("Insira o valor que deseja sacar: ");
                    double valueToWithdraw = scanner.nextDouble();
                    bankAccount.withdraw(valueToWithdraw);
                }
                case 2 -> {
                    System.out.print("Insira o valor que deseja depositar: ");
                    double valueToDeposit = scanner.nextDouble();
                    bankAccount.deposit(valueToDeposit);
                }
                case 3 -> System.out.println("Saldo da conta bancária: R$" + decimalFormat.format(bankAccount.getBalance()));
                case 4 -> {
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
