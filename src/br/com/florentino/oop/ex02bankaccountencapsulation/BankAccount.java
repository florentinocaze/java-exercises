package br.com.florentino.oop.ex02bankaccountencapsulation;

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

    public void withdraw(double value) {
        if (value > this.balance) {
            System.out.println("Saldo insuficiente.");
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
