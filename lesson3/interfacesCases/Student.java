package lesson3.interfacesCases;

public class Student implements Singer {
    private int id;
    private String name;
    private String group;

    public Student() {
    }

    public Student(int id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public void sayHello() {
        System.out.println("hello my name is" + this.name);
    }
    @Override
    public void sing() {
        System.out.println("u spin me right round baby right round...");
    }
}
