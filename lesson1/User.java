package lesson1;

import java.util.Arrays;

public class User {
    private int id = 100;
    private String name = "Rue";
    private boolean status = false;
    private String[] skills = {"java", "js"};
    private double weight = 45.6;
    private int[] wallet = {200, 444};

    public User() {
    }
    public User(int id, String name, boolean status, String[] skills, double weight, int[] wallet) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skills = skills;
        this.weight = weight;
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[] getWallet() {
        return wallet;
    }

    public void setWallet(int[] wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", skills=" + Arrays.toString(skills) +
                ", weight=" + weight +
                ", wallet=" + Arrays.toString(wallet) +
                '}';
    }
}
