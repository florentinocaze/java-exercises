package br.com.florentino.syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Gerencie uma lista de nomes: adicione, remova por índice e busque por nome.

public class Ex04ArrayListUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();

        names.add("João");
        names.add("Larissa");
        names.add("Matheus");

        System.out.println("Nomes presentes na lista:");
        for (int i = 0; i < names.toArray().length; i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        System.out.print("Digite um nome para adicionar à lista: ");
        names.add(scanner.nextLine());

        System.out.println("Nomes presentes na lista:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        System.out.print("Digite um nome para procurar na lista: ");
        String searchName = scanner.nextLine();
        boolean containsName = names.contains(searchName);

        if (containsName) {
            System.out.println("\"" + searchName + "\" está na lista.");
        } else {
            System.out.println("\"" + searchName + "\" não está na lista.");
        }

        System.out.print("Digite o índice de um nome para remover da lista: ");
        int removeName = scanner.nextInt();

        if (removeName >= 1 && removeName <= names.size()) {
            names.remove(removeName - 1);
        } else {
            System.out.println("Índice inválido.");
        }

        System.out.println("Nomes presentes na lista:");
        for (int i = 0; i < names.toArray().length; i++) {
            System.out.println((i + 1) + ". " + names.get(i));
        }

        scanner.close();
    }
}
