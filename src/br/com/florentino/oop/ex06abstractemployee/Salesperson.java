package br.com.florentino.oop.ex06abstractemployee;

public class Salesperson extends Employee {
    private double bonus;
    private double sales;

    public Salesperson(String name, double salary, double sales) {
        super(name, salary);
        this.sales = sales;
        this.bonus = sales * 0.03;
    }

    @Override
    public double calculateSalary() {
        return this.salary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}
