package Homework3.part1.task2;

import java.util.ArrayList;

public class Dog extends Pet {
    private ArrayList<String> favoriteToys;

    public Dog() {
    }

    public Dog(String name, int age, ArrayList<String> favoriteToys) {
        super(name, age);
        this.favoriteToys = favoriteToys;
    }

    public ArrayList<String> getFavoriteToys() {
        return favoriteToys;
    }

    public void setFavoriteToys(ArrayList<String> favoriteToys) {
        this.favoriteToys = favoriteToys;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "favoriteToys=" + favoriteToys +
                '}';
    }
}
