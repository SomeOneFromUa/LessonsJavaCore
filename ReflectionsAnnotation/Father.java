package ReflectionsAnnotation;

import java.util.Objects;

public class Father {
    public int id;

    public Father(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return id == father.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Father() {
    }

    @Override
    public String toString() {
        return "Father{" +
                "id=" + id +
                '}';
    }
}
