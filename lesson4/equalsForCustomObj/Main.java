package lesson4.equalsForCustomObj;

public class Main {
    public static void main(String[] args) {
    User user1 = new User(1, "Rue");
    User user2 = new User(2, "Rue");
    User user3 = new User(2, "Rue");
    User user4 = new User(2, "Rue1");
//    System.out.println(user1.equals(user2)); //true
//    System.out.println(user3.equals(user2)); //true
//    System.out.println(user3.equals(user4)); //false
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());
    }
}
