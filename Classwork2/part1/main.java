package Classwork2.part1;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class main {
    public static void main(String[] args) {
//        Зробити список з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та:
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(17);
        arr.add(13);
        arr.add(6);
        arr.add(22);
        arr.add(31);
        arr.add(45);
        arr.add(66);
        arr.add(100);
        arr.add(-18);
//        1. Перебрати його циклом while
//        int i = 0;
//        while (i < arr.size()) {
//            System.out.println(arr.get(i));
//            i++;
//        }

//        2. перебрати його циклом for
//        for (int j = 0; j < arr.size(); j++) {
//            System.out.println(arr.get(j));
//        }

//        3. перебрати циклом while та вивести числа тільки з непарним індексом
//        int i = 0;
//        while (i < arr.size()) {
//            if (i % 2 != 0) {
//                System.out.println(arr.get(i));
//            }
//            i++;
//        }

//        4. перебрати циклом for та вивести  числа тільки з непарним індексом
//        for (int i = 0; i < arr.size(); i++) {
//            if (i % 2 != 0) {
//                System.out.println(arr.get(i));
//            }
//        }

//        for (int i = 0; i < arr.size(); i++) {
//           if (i % 2 == 0) continue;
//           System.out.println(arr.get(i));
//        }

//        for (int i = 1; i < arr.size(); i+=2) {
//            System.out.println(arr.get(i));
//        }


//        5. перебрати циклом while та вивести  числа тільки парні  значення
//        int i = 0;
//        while (i < arr.size()) {
//            if (arr.get(i) % 2 == 0) {
//                System.out.println(arr.get(i));
//            }
//            i++;
//        }
//        6. перебрати циклом for та вивести  числа тільки парні  значення
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) % 2 == 0) {
//                System.out.println(arr.get(i));
//            }
//        }
//        8. Вивести список в зворотньому порядку.
//        Collections.reverse(arr);
//        System.out.println(arr);

//        9. Всі попередні завдання (окрім 8), але в зворотньому циклі (с заду на перед)
        //1. Перебрати його циклом while
//        int i = arr.size() - 1;
//        while (i >= 0) {
//            System.out.println(arr.get(i));
//            i--;
//        }
        //2. перебрати його циклом for
//        for (int i = arr.size() - 1; i >= 0; i--) {
//            System.out.println(arr.get(i));
//        }
        //3. перебрати циклом while та вивести  числа тільки з непарним індексом
//        int i = arr.size() - 1;
//        while (i >= 0){
//            if (i % 2 != 0){
//                System.out.println(arr.get(i));
//            }
//            i--;
//        }
        //4. перебрати циклом for та вивести  числа тільки з непарним індексом
//        for (int i = arr.size() -1; i >= 0; i--) {
//            if (i % 2 != 0){
//                System.out.println(arr.get(i));
//            }
//        }
        //5. перебрати циклом while та вивести  числа тільки парні  значення
//        int i = arr.size() - 1;
//        while (i >= 0) {
//            if (arr.get(i) % 2 ==0){
//                System.out.println(arr.get(i));
//            }
//            i--;
//        }
        //6. перебрати циклом for та вивести  числа тільки парні значення
//        for (int i = arr.size() - 1; i >= 0; i--) {
//            if (arr.get(i) % 2 == 0){
//                System.out.println(arr.get(i));
//            }
//        }
    }
}
