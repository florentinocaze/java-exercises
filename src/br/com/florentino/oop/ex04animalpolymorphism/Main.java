package br.com.florentino.oop.ex04animalpolymorphism;

/*
Crie a classe base Animal com o método makeSound().
Crie as subclasses Dog, Cat e Bird, cada uma sobrescrevendo makeSound() com seu próprio som.
No Main, crie uma lista do tipo Animal, adicione os três objetos e itere chamando makeSound() para demonstrar o polimorfismo.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Bird());
        animals.add(new Cat());
        animals.add(new Dog());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
