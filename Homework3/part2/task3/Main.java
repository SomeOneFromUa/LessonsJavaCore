package Homework3.part2.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        2.
//Створити інтерфейс метод  creator() якого вертає числовий масив.
//Реалізувати його в двох класах.
//В першому класі метод повинен формувати масив рандомних чисел в діапазоні 0 до 200
//В другому класі метод повинен формувати масив рандомних чисел в діапазоні  0 до х?
//В першому класі та другому класі є поле lenght яке визначає довжину масиву який ви булите генерувати
//В другому класі є додаткове поле  х , яке визначає діапазон.
//В першому классі діапазон завжди постійний. Число ,яке характеризує діапазон оголошено як змінна інтерфейсу
        CustomRange customRange = new CustomRange(20,50);
        ArrayList<Integer> arrayList = customRange.creator();
        System.out.println(arrayList.toString());

        ConstRange constRange = new ConstRange(30);
        ArrayList<Integer> arrayList1 = constRange.creator();
        System.out.println(arrayList1);

    }
}
