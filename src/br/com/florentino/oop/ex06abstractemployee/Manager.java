package br.com.florentino.oop.ex06abstractemployee;

public class Manager extends Employee {
    private double bonus = 20;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return this.salary + ((this.salary * bonus) / 100);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
