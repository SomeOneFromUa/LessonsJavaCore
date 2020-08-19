package Homework3.part1.task2;

public class Pet extends Animal {
    private int age;

    public Pet() {
    }

    public Pet(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                '}';
    }
}
