package homework2.part2;

public class Employee {
    private String name;
    private String surname;
    private int experience;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, int experience, String position) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", position='" + position + '\'' +
                '}';
    }
}
