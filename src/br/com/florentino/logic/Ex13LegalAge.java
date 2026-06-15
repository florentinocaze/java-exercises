package br.com.florentino.logic;

import java.util.Scanner;

/**
 * Leia nome e idade. Mostre se a pessoa é maior ou menor de idade.
 */

public class Ex13LegalAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        if (idade > 0 && idade < 18) {
            System.out.println(name + " é de menor idade.");
        } else if (idade >= 18) {
            System.out.println(name + " é de maior idade.");
        } else {
            System.out.println("Insira uma idade válida.");
        }

        scanner.close();
    }
}
