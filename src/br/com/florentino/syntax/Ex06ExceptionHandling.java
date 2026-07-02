package br.com.florentino.syntax;

import java.util.InputMismatchException;
import java.util.Scanner;

// Solicite um número inteiro e trate entradas inválidas com mensagem amigável.

public class Ex06ExceptionHandling {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int number = scanner.nextInt();
            System.out.println("Você digitou " + number + ".");
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Valor inválido.");
        }
    }
}
