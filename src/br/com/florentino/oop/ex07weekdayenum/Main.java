package br.com.florentino.oop.ex07weekdayenum;

/*
Crie o enum WeekDay com os sete dias da semana.
Adicione um método isWeekday() que retorna true para dias úteis e
false para fim de semana, e um método isWeekend() como complemento.
No Main, itere sobre todos os valores do enum e exiba a classificação de cada dia.
*/

public class Main {
    public static void main(String[] args) {
        for (WeekDay weekDay : WeekDay.values()) {
            System.out.println("Dia: " + weekDay.getName() + ".");
            System.out.println("Dia útil: " + (weekDay.isWeekDay() ? "Sim." : "Não."));
            System.out.println("Fim de semana: " + (weekDay.isWeekend() ? "Sim." : "Não."));
            System.out.println();
        }
    }
}
