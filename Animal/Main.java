package Animal;

import Animal.*;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барсик");
        dog.makeSound();
        dog.bark();

        Cat cat = new Cat("Мурка");
        cat.makeSound();
        cat.meow();

        Hamster hamster = new Hamster("Хомяшка");
        hamster.makeSound();
        hamster.runOnWheel();

        Horse horse = new Horse("Буцефал");
        horse.makeSound();
        horse.gallop();

        Camel camel = new Camel("Рашид");
        camel.makeSound();
        camel.walkInDesert();

        Donkey donkey = new Donkey("Иоанн");
        donkey.makeSound();
        donkey.carryLoad();
    }
}