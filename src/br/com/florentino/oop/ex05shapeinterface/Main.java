package br.com.florentino.oop.ex05shapeinterface;

/*
Crie a interface Shape com os métodos calculateArea() e calculatePerimeter().
Implemente as classes Circle e Rectangle, cada uma fornecendo sua própria fórmula.
No Main, crie uma lista do tipo Shape, adicione os objetos e exiba área e perímetro de cada um.
*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o diâmetro do círculo: ");
        double circleDiameter = scanner.nextDouble();

        System.out.print("Insira a base do retângulo: ");
        double rectangleWidth = scanner.nextDouble();

        System.out.print("Insira a altura do retângulo: ");
        double rectangleHeight = scanner.nextDouble();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(circleDiameter));
        shapes.add(new Rectangle(rectangleHeight, rectangleWidth));

        for (Shape shape : shapes) {
            System.out.println(shape.getName());
            System.out.println("Área: " + decimalFormat.format(shape.calculateArea()));
            System.out.println("Perímetro: " + decimalFormat.format(shape.calculatePerimeter()));
        }

        scanner.close();
    }
}
