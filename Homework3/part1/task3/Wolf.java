package Homework3.part1.task3;

public class Wolf extends WildAnimal {
    private String color;

    public Wolf() {
    }

    @Override
    public void logArea() {
        System.out.println("the " + this.color + " wolf leaves in " + this.getArea());
    }

    public void singToMoon() {
        System.out.println("wuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    public Wolf(String name, String area, String color) {
        super(name, area);
        this.color = color;
    }

    public String getSpecies() {
        return color;
    }

    public void setSpecies(String species) {
        color = color;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "color='" + color + '\'' +
                '}';
    }
}
