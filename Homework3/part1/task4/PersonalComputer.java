package Homework3.part1.task4;

public class PersonalComputer extends Computer {
    private String size;
    private double weight;

    public PersonalComputer() {
    }

    public PersonalComputer(String core, String RAM, String motherboard, String system, String size, double weight) {
        super(core, RAM, motherboard, system);
        this.size = size;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
