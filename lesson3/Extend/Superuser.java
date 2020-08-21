package lesson3.Extend;

public class Superuser extends User {
    private String role;

    public Superuser() {
    }

    public Superuser(String name, int id, String role) {
        super(name, id);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void sayHello() {
        System.out.println("hi!! from child");
    }
}
