package br.com.florentino.logic;

/**
 * Calcule em quantos anos Francisco ultrapassará Sara em altura.
 */

public class Ex18FranciscoAndSara {
    public static void main(String[] args) {
        int franciscoHeight = 110;
        int saraHeight = 150;

        int franciscoAnnualGrowth = 3;
        int saraAnnualGrowth = 1;

        int years = 0;

        while (franciscoHeight <= saraHeight) {
            franciscoHeight += franciscoAnnualGrowth;
            saraHeight += saraAnnualGrowth;

            years += 1;
        }

        System.out.println("Serão necessários " + years + " anos para Francisco ultrapassar Sara em altura.");
    }
}
