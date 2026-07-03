package br.com.florentino.oop.ex04animalpolymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Au-au");
    }
}
