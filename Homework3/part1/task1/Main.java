package Homework3.part1.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1.Створити їєрархію (Класи пусті! без полів!просто їерархія)
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
    }
}
