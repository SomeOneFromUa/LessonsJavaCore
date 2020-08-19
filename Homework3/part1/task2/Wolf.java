package Homework3.part1.task2;

public class Wolf extends WildAnimal {
    private String Species;

    public Wolf() {
    }

    public Wolf(String name, String area, String species) {
        super(name, area);
        Species = species;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "Species='" + Species + '\'' +
                '}';
    }
}
