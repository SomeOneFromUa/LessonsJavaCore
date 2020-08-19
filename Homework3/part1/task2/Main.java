package Homework3.part1.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//2.Створити їєрархію . Батько має одне поле, кожен нащадок має +1 поле
//Описати "джентельменькій набір" методів
//Amimal-> WildAnimal
//Animal-> Pet
//WildAnimal->Fox
//WildAnimal->Wolf
//Pet->Cat
//Pet->Dog
        ArrayList<Animal> arr = new ArrayList<>(Arrays.asList(
                new Fox(),
                new Dog(),
                new Wolf(),
                new WildAnimal(),
                new Pet()
        ));
        ArrayList<String> favoriteToys = new ArrayList<>(Arrays.asList("ball", "rope with toy"));
        Dog dog = new Dog("rex", 4, favoriteToys);
        System.out.println(dog);
        Animal animal = new Dog("name", 4, favoriteToys);
        System.out.println(animal);
        System.out.println(animal.getName());
    }
}
