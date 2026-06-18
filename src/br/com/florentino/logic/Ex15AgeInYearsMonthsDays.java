package br.com.florentino.logic;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Leia o ano de nascimento e calcule anos, meses e dias vividos.

public class Ex15AgeInYearsMonthsDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua data de nascimento (DD/MM/AAAA): ");
        String birthDate = scanner.nextLine();

        String[] date = birthDate.split("/");

        int birthDay = Integer.parseInt(date[0]);
        int birthMonth = Integer.parseInt(date[1]);
        int birthYear = Integer.parseInt(date[2]);

        LocalDate startDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);

        System.out.println("Você já viveu " + period.getYears() + " anos, " + period.getMonths() + " meses e " + period.getDays() + " dias.");

        scanner.close();
    }
}
