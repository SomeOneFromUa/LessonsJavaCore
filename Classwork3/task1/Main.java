package Classwork3.task1;

public class Main {
    public static void main(String[] args) {
// 1 .
//Створити інтрефейс, з методом square() який повертає число з поаваючою крапкою.
//Суть метода square() - обчисленя полщі в залежності від фігури.
//Створити двіі реалізації цього інтерфейсу.
//Одна це Kvadrat. цей класс має поля, які харатеризують його сторони.
//Друга - Priamokutnyk цей класс має поля, які харатеризують його сторони.
        Kvadrat kvadrat = new Kvadrat(3);
        double square = kvadrat.square();
        System.out.println(square);

        Priamokutnik priamokutnik = new Priamokutnik(4,6);
        double square1 = priamokutnik.square();
        System.out.println(square1);
    }
}
