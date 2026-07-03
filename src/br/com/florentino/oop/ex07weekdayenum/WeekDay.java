package br.com.florentino.oop.ex07weekdayenum;

public enum WeekDay {
    SUNDAY ("Domingo", 1),
    MONDAY ("Segunda", 2),
    TUESDAY ("Terça", 3),
    WEDNESDAY ("Quarta", 4),
    THURSDAY ("Quinta", 5),
    FRIDAY ("Sexta", 6),
    SATURDAY ("Sábado", 7);

    private final String name;
    private final int value;

    WeekDay(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public boolean isWeekDay() {
        return this.value >= 2 && this.value <= 6;
    }

    public boolean isWeekend() {
        return !isWeekDay();
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
