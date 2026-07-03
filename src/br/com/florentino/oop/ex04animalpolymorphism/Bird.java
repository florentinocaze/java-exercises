package br.com.florentino.oop.ex04animalpolymorphism;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Piu-piu");
    }
}
