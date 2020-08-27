package Classwork5.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Задача: дан отсортированный по возрастанию массив целых чисел. Необходимо вернуть наименьший и наибольший индекс заданного элемента.
//Входные данные: arr — массив целых чисел значения которых по модулю не больше 10. Размер массива не более 10 элементов.
//Вывод: наибольший и наименьший индекс в массиве заданного элемента. Если такого элемента нет в массиве, выведите -1.
//
//Пример:
//Arr = [1, 2, 3, 4, 4, 4, 4, 7, 7, 9, 14]
//1. Key = 1
//Answer: MinIndex = 0, MaxIndex = 0.
//2. Key = 4
//Answer: MinIndex = 3, MaxIndex = 6.
        Indexer indexer = new Indexer(new Integer[]{1, 2, 3, 4, 4, 4, 4, 7, 7, 9});
        indexer.findIndexes(1);
        indexer.findIndexes(4);
        indexer.findIndexes(5);
        indexer.findIndexes(1);

//        Indexer indexer2 = new Indexer(new Integer[]{1, 2, 3, 4, 4, 4, 4, 7, 7, 9,5});

    }
}
