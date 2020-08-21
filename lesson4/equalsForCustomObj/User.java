package lesson4.equalsForCustomObj;

import java.util.Objects;

public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    // потрыбно знати як пишеться
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // перевірка на посилання
        if (o == null || getClass() != o.getClass()) return false; // порівняння будьякого обєкту з null дає false || якщо класи не співпадають то буде true
        User user = (User) o;
        // це були первинні перевірки
        // відповідність ссилкі
        // не нул і однакові класи
        // далі іде порівняння полів
        return id == user.id &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
