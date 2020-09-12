package ReflectionsAnnotation;

import java.util.Objects;

public class Uzer extends Father {
    private String name;
    @ValidatorInt(min = 0, max = 100) //ігтерфейс не може мати поля але сприймай це як поля хоча це і методи
    // мін і макс відпряцюють як гетери і вепнуть значення
    private int age;

    public Uzer(int id, String name, int age) throws IllegalAccessException {
        super(id);
        this.name = name;
        this.age = age;
        Validator.validateInt(this.getClass(), this); // для роботи валідатора необхідно прокинути туди класс обєкта і сам обєкт
    }

    @Override
    public String toString() {
        return "Uzer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public Uzer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Uzer uzer = (Uzer) o;
        return age == uzer.age &&
                Objects.equals(name, uzer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age);
    }
}
