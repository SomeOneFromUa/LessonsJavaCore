package homework1;

import java.util.Arrays;

public class User {
    private String name = "default";
    private boolean status = false ;
    private int age = 16;
    private double weight = 24.5;
    private String[] skills = null;
    private char symbol = ' ';

    public User() {
    }

    public User(String name, boolean status, int age, double weight, String[] skills, char symbol) {
        this.name = name;
        this.status = status;
        this.age = age;
        this.weight = weight;
        this.skills = skills;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", age=" + age +
                ", weight=" + weight +
                ", skills=" + Arrays.toString(skills) +
                ", symbol=" + symbol +
                '}';
    }
}
