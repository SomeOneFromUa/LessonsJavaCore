package Homework3.part1.task3;

import java.util.ArrayList;

public class Cat extends Pet {
    private ArrayList<String> favoriteFood;

    public Cat() {
    }
    public void logFood() {
        System.out.println(this.getName() + " eats: " + this.favoriteFood.toString());
    }
    public Cat(String name, int age, ArrayList<String> favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public ArrayList<String> getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(ArrayList<String> favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "favoriteFood=" + favoriteFood +
                '}';
    }
}
