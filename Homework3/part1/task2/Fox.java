package Homework3.part1.task2;

public class Fox extends WildAnimal {
    private String genus;

    public Fox() {
    }

    public Fox(String name, String area, String genus) {
        super(name, area);
        this.genus = genus;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "genus='" + genus + '\'' +
                '}';
    }
}
