package br.com.florentino.oop.ex02bankaccountencapsulation;

import br.com.florentino.oop.ex09customexception.InsufficientBalanceException;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void withdraw(double value) throws InsufficientBalanceException {
        if (value > this.balance) {
            throw new InsufficientBalanceException("Saldo insuficiente.");
        } else if (value <= 0) {
            System.out.println("Valor inválido.");
        } else {
            this.balance -= value;
        }
    }

    public double getBalance() {
        return balance;
    }
}
