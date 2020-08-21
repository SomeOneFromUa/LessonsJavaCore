package homework2.part1;

public class Pat {
    private String name;
    private int age;

    public Pat() {
    }

    public Pat(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String toString() {
        return "Pat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void pipi() {
        System.out.println(this.name + "-  pipi");
    }
}
