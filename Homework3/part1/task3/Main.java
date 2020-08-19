package Homework3.part1.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//3.Створити їєрархію . Батько має одне поле, кожен нащадок має +1 поле
//Описати "джентельменькій набір" методів.
//Батько має 1 метод, кожен нащадок має +1 метод
//Amimal-> WildAnimal
//Animal-> Pet
//WildAnimal->Fox
//WildAnimal->Wolf
//Pet->Cat
//Pet->Dog
        ArrayList<String> favoriteFood = new ArrayList<>(Arrays.asList("corn", "sour cream", "fish"));
        ArrayList<String> favoriteToys = new ArrayList<>(Arrays.asList("ball", "rope with toy", "bone"));

        WildAnimal wildAnimal = new WildAnimal("Bear", "forest");
        wildAnimal.logName();
        wildAnimal.logArea();
        System.out.println("---------------");

        Pet pet = new Pet("Rex", 3);
        pet.logName();
        pet.logAge();
        System.out.println("---------------");


        Cat cat = new Cat("Vasilyi", 2, favoriteFood);
        cat.logName();
        cat.logAge();
        cat.logFood();
        System.out.println("---------------");


        Dog dog = new Dog("Doggy", 5, favoriteToys);
        dog.logName();
        dog.logAge();
        dog.logToys();
        System.out.println("---------------");

        Wolf wolf = new Wolf("wolf", "forest", "grey");
        wolf.logName();
        wolf.logArea();
        wolf.singToMoon();
    }
}
