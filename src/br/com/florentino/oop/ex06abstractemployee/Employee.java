package br.com.florentino.oop.ex06abstractemployee;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
