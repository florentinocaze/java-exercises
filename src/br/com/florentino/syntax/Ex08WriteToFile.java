package br.com.florentino.syntax;

import java.io.*;
import java.util.Scanner;

// Receba frases do usuário e salve em um arquivo .txt até digitar "sair".

public class Ex08WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma frase para adicionar ao arquivo. Para sair, digite \"sair\": ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("sair")) {
                break;
            }

            writeToFile(message);
        }

        scanner.close();
    }

    private static void writeToFile(String message) {
        File directory = new File("src/br/com/florentino/syntax/resources");

        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directory, "sentences.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
