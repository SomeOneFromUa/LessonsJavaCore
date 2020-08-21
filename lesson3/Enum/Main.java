package lesson3.Enum;

public class Main {
    public static void main(String[] args) {
        //виклик значення enum
        Week day = Week.FRIDAY;
        System.out.println(day);
        day.setWorkHours(40);
        System.out.println(day);
    }
}
