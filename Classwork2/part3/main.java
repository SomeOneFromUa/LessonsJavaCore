package Classwork2.part3;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//Існують наступні об'єкти.
//Створити класи під них.
//Створити метод , який об'єднує об'єкти з однаковими id в єдиний об'єкт
//і повертає вам цей список об'єктів.
//Класс під загальний об'єкт рписати самостійно. Він повинен містити тільки необхідні поля
//
//
//список 1
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Person(1, "vaysa", 32),
                new Person(2, "petya", 31),
                new Person(3, "kolya", 30),
                new Person(4, "anya", 29),
                new Person(5, "masha", 28),
                new Person(6, "andriy", 30),
                new Person(7, "maxim", 31),
                new Person(8, "vadym", 32),
                new Person(9, "taras", 33))
        );
//список 2
        ArrayList<Auth> auths = new ArrayList<>(Arrays.asList(
                new Auth(5, "login5", "password5"),
        new Auth(2, "login2", "password2"),
        new Auth(1, "login1", "password1"),
        new Auth(7, "login7", "password7"),
        new Auth(3, "login3", "password3"),
        new Auth(4, "login4", "password4"),
        new Auth(8, "login8", "password8"),
        new Auth(6, "login6", "password6"),
        new Auth(9, "login9", "password9")
        ));
//список 3 - це результат робботи методу
        Custom method = new Custom();
        ArrayList<User> result = method.union(people, auths);
        for (User user : result) {
            System.out.println(user);
        }
    }
}
