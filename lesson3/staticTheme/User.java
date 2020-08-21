package lesson3.staticTheme;

public class User {
    public static int id = 100;
    public String name = "Rue";

    public User() {
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "id='" + id + '\'' +
                '}';
    }
}
