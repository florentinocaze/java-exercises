package br.com.florentino.oop.ex04animalpolymorphism;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau-miau");
    }
}
