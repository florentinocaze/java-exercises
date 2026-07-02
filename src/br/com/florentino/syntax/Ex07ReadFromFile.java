package br.com.florentino.syntax;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Leia um arquivo .txt linha por linha e exiba o conteúdo no console.

public class Ex07ReadFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o caminho do arquivo a ser lido: ");
        String fileName = scanner.nextLine();

        readFile(fileName);

        scanner.close();
    }

    public static void readFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
