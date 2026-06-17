package br.com.florentino.syntax;

import java.util.Scanner;

/**
 * Leia uma frase e exiba: tamanho, maiúsculas, invertida e a contagem de vogais.
 */

public class Ex01StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String phrase = scanner.nextLine();

        int phraseLength = phrase.length();

        int upperCaseCount = 0;
        int vowelCount = 0;

        char[] vowels = new char[]{
                'a', 'à', 'á', 'â', 'ä', 'ã',
                'e', 'è', 'é', 'ê', 'ë',
                'i', 'ì', 'í', 'î', 'ï',
                'o', 'ò', 'ó', 'ô', 'ö', 'õ',
                'u', 'ù', 'ú', 'û', 'ü'
        };

        for (int i = 0; i < phraseLength; i++) {
            if (Character.isUpperCase(phrase.charAt(i))) {
                upperCaseCount += 1;
            }

            for (char vowel : vowels) {
                if (vowel == phrase.toLowerCase().charAt(i)) {
                    vowelCount += 1;
                }
            }
        }

        String inversedPhrase = new StringBuilder(phrase).reverse().toString();

        System.out.println("Tamanho da frase: " + phraseLength + " caracteres;");
        System.out.println("Quantidade de letras maiúsculas: " + upperCaseCount + ";");
        System.out.println("Frase invertida: \"" + inversedPhrase + "\";");
        System.out.println("Contagem de vogais: " + vowelCount + ".");

        scanner.close();
    }
}
