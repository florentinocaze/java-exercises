package br.com.florentino.oop.ex09customexception;

/*
Crie a exceção personalizada InsufficientBalanceException estendendo Exception.
Reutilize a classe BankAccount do exercício 02, fazendo o método withdraw()
lançar essa exceção quando o saldo for insuficiente.
No Main, trate a exceção com try/catch e exiba uma mensagem amigável ao usuário.
*/

import br.com.florentino.oop.ex02bankaccountencapsulation.BankAccount;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o saldo inicial da conta bancária: ");
        double initialBalance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(initialBalance);

        System.out.println("Conta criada com sucesso.");
        System.out.println("Saldo disponível: R$" + decimalFormat.format(bankAccount.getBalance()) + ".");

        System.out.print("Insira o valor que deseja sacar: ");
        double valueToWithdraw = scanner.nextDouble();

        try {
            bankAccount.withdraw(valueToWithdraw);
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo atual: R$" + decimalFormat.format(bankAccount.getBalance()) + ".");
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
