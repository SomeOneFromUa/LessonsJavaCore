package lesson1;

public class Start {
    public static void main(String[] args) {
        new User();
        new User();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

//        String[] skills = {"java", "angular"};
//        String[] skills = new String[]{"react", "java"};
        int[] wallet = new int[4];
        wallet[0] = 3;
        wallet[1] = 44;
        wallet[2] = 43;
        wallet[3] = 33;

        User user4 = new User(30, "sdfs", false, new String[]{"react", "java core"}, 50.9, wallet);
        System.out.println(user4);
    }
}
