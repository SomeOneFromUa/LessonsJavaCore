package lesson4.equals;

public class Main {
    public static void main(String[] args) {
        String s1 = "okten";
        String s2 = "okten";
        System.out.println(s1 == s2); // true
        // оператор == в жабі порівнює посилання (місце розташування)
        // тру тут тому що
        // в жабі є String pool простір. Якщо ми маємо дві однакові стрінги то
        // друга просто буде ссилатися на першу - це для економії памяті
        String s3 = new String("okten"); // тут буде нова ссилка
        System.out.println(s1 == s3); //false різні ссилкі при одному значенні
        System.out.println(s2 == s3); //false
        // використовувати Object.equals()
        // коли треба порівнювати свої обєкти потрібно використовувати в класі метод equals - але при цьому його перевизначати
        System.out.println(s1.equals(s3));// true
        System.out.println(s2.equals(s3));// true
    }
}
