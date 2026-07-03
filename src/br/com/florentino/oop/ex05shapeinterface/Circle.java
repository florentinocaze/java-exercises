package br.com.florentino.oop.ex05shapeinterface;

public class Circle implements Shape {
    private final String name = "Círculo";
    private double diameter;
    private final double radius;

    public Circle(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
