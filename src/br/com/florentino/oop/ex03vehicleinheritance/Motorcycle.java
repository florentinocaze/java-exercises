package br.com.florentino.oop.ex03vehicleinheritance;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String brand, String model, int year, boolean hasSideCar) {
        super(brand, model, year);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Informações da Moto ---");
        super.displayInfo();
        if (this.hasSideCar) {
            System.out.println("Carro lateral: Presente");
        } else {
            System.out.println("Carro lateral: Ausente.");
        }
    }

    public boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
