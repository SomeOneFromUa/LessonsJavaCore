package homework2.part3;

public class main {
    public static void main(String[] args) {
        client user1 = new client("Rue", "Hehelia", "26/03/97", "AU", 343434, "Ukraine Novovolynsk");
        motion motion1 = new motion(44, "54,54,54", "Usd", user1);
        System.out.println(motion1);
    }
}
