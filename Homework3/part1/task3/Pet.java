package Homework3.part1.task3;

public class Pet extends Animal {
    private int age;

    @Override
    public void logName() {
        System.out.println("name of a pet - " + this.getName());
    }

    public void logAge() {
        System.out.println("age of " + this.getName() + " is " + this.age );
    }


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
