package lesson3.Extend;

public class Main {
    public static void main(String[] args) {
        User user = new User("rue", 1);
        user.sayHello();

        Superuser superuser = new Superuser("Mark", 2, "customer");
        // оверрайд метода батька
        superuser.sayHello();
// від дитини не можна створити екземпляр батька
// Superuser superuser1 = new User("Oleg", 3);
        // а від батька можна
        User superuser1 = new Superuser("Oleg", 3,"admin");
        superuser.sayHello(); // заоверрайджений метод
    }
}
