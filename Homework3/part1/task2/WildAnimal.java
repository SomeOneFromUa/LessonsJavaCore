package Homework3.part1.task2;

public class WildAnimal extends Animal {
    private String area;

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
