package lesson3.interfacesCases;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ігтерфейс це контракт за умовою якого якщо клас імплементує цей інтерфейс він повинен реалізувати його метод(и)
        // в примусовому порядку визначається які методи повинні бути реалізовані у класі
        // імплементувати можна багато а екстендити ьільки один

        // створюємо масив і закидуємо туди екземпляри які імплементують ігтерфейс із типізації
        ArrayList<Singer> singers = new ArrayList<>();

        Student student = new Student(1, "Rue", "null");
        singers.add(student);
        singers.add(new Worker());
        // коли ми доступаємося до елементів то нам доступний лише метод інтерфейсу реалізований в класі екземпляру
        // все інше - ні
        singers.get(0).sing();
        singers.get(1).sing();
        // хоча з під самого екземпляру доступне все
        student.sayHello();

        // поля в інтерфейсах по замовчуванню буде статичними і константами (бережемо память!)

        // по замовчуванню ми не можемо створювати екземпляр інтерфейса
//        Singer singer = new Singer(); no!!!
        // тому що необхідно реалізовуваати абстрактний метод

        Singer singer = new Singer() {
            @Override
            public void sing() {
                //some code
            }
        };

        // інтерфейс називають функціональним якщо він має лише один метод
        // його можна реалізувати за допомогою лямбда виразу

        Singer singer1 = () -> System.out.println("hello world");
        // автоматичрно не запускається тому:
        singer1.sing();
        // реалізація обєкту типу singer визначається реалізацією методу sing - це синтаксичний цукор

    }
}
