package br.com.florentino.oop.ex02bankaccountencapsulation;

import br.com.florentino.oop.ex09customexception.InsufficientBalanceException;

public class BankAccount {
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }

        this.balance = balance;
    }

    public void deposit(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor para depósito deve ser positivo.");
        }

        this.balance += value;
    }

    public void withdraw(double value) throws InsufficientBalanceException {
        if (value <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }

        if (value > this.balance) {
            throw new InsufficientBalanceException("Saldo insuficiente.");
        }

        this.balance -= value;
    }

    public double getBalance() {
        return balance;
    }
}
