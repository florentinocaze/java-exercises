package br.com.florentino.oop.ex03vehicleinheritance;

/*
Crie a classe base Vehicle com atributos comuns (marca, modelo, ano) e um método displayInfo().
Crie as subclasses Car e Motorcycle, cada uma com atributos próprios e sobrescrevendo displayInfo() com super.
No Main, instancie um objeto de cada subclasse e exiba suas informações.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a marca do carro: ");
        String carBrand = scanner.nextLine();
        System.out.print("Insira o modelo do carro: ");
        String carModel = scanner.nextLine();
        System.out.print("Insira o ano do carro: ");
        int carYear = scanner.nextInt();
        System.out.print("Insira a quantidade de portas do carro: ");
        int carNumberOfDoors = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Insira a marca da moto: ");
        String motorcycleBrand = scanner.nextLine();

        System.out.print("Insira o modelo da moto: ");
        String motorcycleModel = scanner.nextLine();

        System.out.print("Insira o ano da moto: ");
        int motorcycleYear = scanner.nextInt();

        scanner.nextLine();

        System.out.print("A moto possui carro lateral? (S/N): ");
        String motorcycleHasSideCar = scanner.nextLine();
        boolean hasSideCar = motorcycleHasSideCar.equalsIgnoreCase("s");

        Car car = new Car(carBrand, carModel, carYear, carNumberOfDoors);
        car.displayInfo();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, hasSideCar);
        motorcycle.displayInfo();

        scanner.close();
    }
}
