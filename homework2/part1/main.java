package homework2.part1;

public class main {
    public static void main(String[] args) {
        Person Rue = new Person("Rue", "Hehelia", 23, "rue.com.ua", "login", "password", "Shanni", 5);
        System.out.println(Rue);
        Rue.login("login", "password");
        Rue.login("login", "password2");
        Rue.getPat().pipi();
    }
}
