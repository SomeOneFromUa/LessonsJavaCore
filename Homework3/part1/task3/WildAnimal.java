package Homework3.part1.task3;

public class WildAnimal extends Animal {
    private String area;

    @Override
    public void logName() {
        System.out.println("this animal is called - " + this.getName());
    }
    public void logArea() {
        System.out.println("the" + this.getName() + " leaves in the " + this.area);
    }
    public WildAnimal() {
    }

    public WildAnimal(String name, String area) {
        super(name);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "area='" + area + '\'' +
                '}';
    }
}
