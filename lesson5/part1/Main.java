package lesson5.part1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Set не гарантує чітку послідовність елементів і не має сортуючих методів
        // тому або використовуємо TreeSet where User class have iplementation of Comparable<User> and overrided method CompareTo
        // або створюємо List і закидуємо туди наш Set

        Set<User> usersSet = new HashSet<>();
        usersSet.add(new User(1, "Rue", false));
        usersSet.add(new User(2, "Tue", true));
        usersSet.add(new User(3, "Due", true));
        usersSet.add(new User(5, "Sue", true));
        usersSet.add(new User(4, "Mue", true));
        usersSet.add(new User(4, "Mue", true));
        usersSet.add(new User(9, "Vue", false));
        usersSet.add(new User(10, "Pue", true));
        usersSet.add(new User(6, "Cue", true));
        usersSet.add(new User(6, "Cue", true));
        usersSet.add(new User(8, "Nue", false));
        usersSet.add(new User(7, "Zue", true));


        ArrayList<User> users = new ArrayList<>(usersSet);

//users.sort(new Comparator<User>() {
//    @Override
//    public int compare(User user, User t1) {
//        return user.getName().compareTo(t1.getName());
//    }
//});

//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User user, User t1) {
//                return t1.getName().compareTo(user.getName());
//            }
//        });

//        users.sort((User user, User t1) -> user.getName().compareTo(t1.getName()) );
//        Collections.sort(users, (User user, User t1) -> t1.getName().compareTo(user.getName()));

//        for (User user : users) {
//            System.out.println(user);
//        }
//        як і в js є купа методів типу
//        users.forEach(user -> System.out.println(user));

        
        
        
// існує обгортка для колекції яка має купу методів як в жаба в скрипті
        Stream<User> stream = users.stream();

        List<User> filtered = stream.filter(user -> user.getId() > 6).collect(Collectors.toList());
        
//        users.stream().filter(user -> user.getId() < 5).sorted((user, t1) -> user.getId() - t1.getId()).forEach(user -> System.out.println(user));
        
        
        System.out.println("--------------- sourse List");
        for (User user : users) {
            System.out.println(user);
        }
        Stream<User> stream1 = users.stream();
        List<User> sortedCollectin = stream1.sorted((user, t1) -> t1.getId() - user.getId()).collect(Collectors.toList());
        System.out.println("------------- sourse list after sorted in stream");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("----------sorted in stream");
        for (User user : sortedCollectin) {
            System.out.println(user);
        }
// sorted не змінює вхідний масив
//        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//        stream кожен раз закривається після використання, проітерувати після звичайним ітератором не вийде
    }
}
