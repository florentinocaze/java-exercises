# OOP

Exercises focused on Object-Oriented Programming: classes, encapsulation, inheritance, polymorphism, interfaces, abstract classes, enums, and a final integration project.

Each exercise is organized in its own package containing the relevant classes and a `Main.java` entry point.

---

## Exercises

| # | Package | Description | Concepts |
|---|---------|-------------|----------|
| 01 | `ex01productclass/` | Create the Product class with name, price, and quantity. Implement discount and total stock value methods. | Class, attributes, constructor, methods |
| 02 | `ex02bankaccountencapsulation/` | Create BankAccount with an encapsulated balance. Implement deposit(), withdraw(), and getBalance(). | Encapsulation, getters/setters, validation |
| 03 | `ex03vehicleinheritance/` | Create a base Vehicle class and subclasses Car and Motorcycle with their own attributes and methods. | Inheritance, extends, super, overriding |
| 04 | `ex04animalpolymorphism/` | Create Animal with makeSound(). Subclasses Dog, Cat, and Bird override the method. | Polymorphism, @Override, list of Animal |
| 05 | `ex05shapeinterface/` | Create a Shape interface with calculateArea() and calculatePerimeter(). Implement Circle and Rectangle. | Interface, implements, contract |
| 06 | `ex06abstractemployee/` | Create an abstract Employee class with an abstract calculateSalary() method. Implement Manager and Salesperson. | Abstract class, abstract, polymorphism |
| 07 | `ex07weekdayenum/` | Create a WeekDay enum with methods to check if a day is a weekday or a weekend. | Enum, methods in enum, switch |
| 08 | `ex08productlist/` | Manage a list of Product objects. Add, remove, filter by price, and sort by name. | ArrayList<T>, Comparator, basic streams |
| 09 | `ex09customexception/` | Create an InsufficientBalanceException. Throw it in withdraw() and handle it in main. | Custom exception, throw, throws |
| 10 | `ex10inventorysystem/` | Mini inventory system: register, list, search, sell, and generate a simple report. | Integration: classes, inheritance, lists, exceptions |

---

## Structure

```
oop/
├── ex01productclass/
│   ├── Product.java
│   └── Main.java
├── ex02bankaccountencapsulation/
│   ├── BankAccount.java
│   └── Main.java
├── ex03vehicleinheritance/
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Motorcycle.java
│   └── Main.java
├── ex04animalpolymorphism/
│   ├── Animal.java
│   ├── Dog.java
│   ├── Cat.java
│   ├── Bird.java
│   └── Main.java
├── ex05shapeinterface/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Rectangle.java
│   └── Main.java
├── ex06abstractemployee/
│   ├── Employee.java
│   ├── Manager.java
│   ├── Salesperson.java
│   └── Main.java
├── ex07weekdayenum/
│   ├── WeekDay.java
│   └── Main.java
├── ex08productlist/
│   └── Main.java
├── ex09customexception/
│   ├── InsufficientBalanceException.java
│   └── Main.java
├── ex10inventorysystem/
│   ├── Inventory.java
│   └── Main.java
└── README.md
```

---

## Notes

- Each package is self-contained – all classes needed to run an exercise are within its own directory;
- Exercise 09 extends the BankAccount from Exercise 02, now with custom exception handling;
- Exercise 10 integrates concepts from all previous exercises into a single small system.