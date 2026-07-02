package br.com.florentino.syntax;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Crie um dicionário de países e capitais. Permita consulta por país.

public class Ex05HashMapUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("Brasil", "Brasília");
        countriesAndCapitals.put("Canadá", "Otawwa");
        countriesAndCapitals.put("China", "Pequim");
        countriesAndCapitals.put("Egito", "Cairo");
        countriesAndCapitals.put("Rússia", "Moscou");
        countriesAndCapitals.put("Alemanha", "Berlim");
        countriesAndCapitals.put("França", "Paris");
        countriesAndCapitals.put("Tailândia", "Bangcoc");
        countriesAndCapitals.put("México", "Cidade do México");

        System.out.print("Insira um país para buscar no dicionário: ");
        String countryName = scanner.nextLine();
        String formattedName = countryName.substring(0, 1).toUpperCase() + countryName.substring(1).toLowerCase();

        if (countriesAndCapitals.containsKey(formattedName)) {
            System.out.println("Capital: " + countriesAndCapitals.get(formattedName) + ".");
        } else {
            System.out.println("País não encontrado na lista.");
        }

        scanner.close();
    }
}
