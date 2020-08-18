package Classwork2.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Створити пустий список та :
        ArrayList<Integer> arr = new ArrayList<>();

        //1. Заповнити його 50 парними числами.
//         int idx = 0;
//         int num = 0;
//         while (idx < 50) {
//             arr.add(num);
//             idx++;
//             num+=2;
//         }
//         System.out.println(arr);


//        for (int i = 0; arr.size() < 50; i+=2) {
//            arr.add(i);
//        }
//        System.out.println(arr);

        //2. Заповнити його 50 непарними числами.
//        int idx = 0;
//        int num = 1;
//        while (idx < 50) {
//            arr.add(num);
//            idx++;
//            num+=2;
//        }
//        System.out.println(arr);

//        for (int i = 1; arr.size() < 50; i+=2) {
//            arr.add(i);
//        }
//        System.out.println(arr);


        // 1. используя Math.random заполнить список 100 элементами.
        for (int i = 0; i < 100; i++) {
            arr.add((int) Math.round(Math.random()*(999 - -999) + -999));
        }
        System.out.println(arr);

        // диапазон рандома от -999 до 999.

        // 2. Вывести на консоль  каждый третий елемент
//        for (int i = 0; i < arr.size(); i+=3) {
//            if (i == 0) continue;
//            System.out.println(arr.get(i));
//        }


        // 3. Вывести на консоль  каждый третий елемент
        // но при условии что он имеет парное значение.
//        for (int i = 0; i < arr.size(); i+=3) {
//            if (i == 0) continue;
//            if (arr.get(i) % 2 == 0){
//                System.out.println(arr.get(i));
//            }
//        }


        // 4. Вывести на консоль  каждый третий елемент
        // но при условии что он имеет парное значение и
        //// записать их в другой список.
//        ArrayList<Integer> arr2 = new ArrayList<>();
//            for (int i = 0; i < arr.size(); i+=3) {
//            if (i == 0) continue;
//            if (arr.get(i) % 2 != 0) {
//                int value = arr.get(i);
//                System.out.println(value);
//                arr2.add(value);
//            }
//        }
//            System.out.println(arr2);
    }
}
