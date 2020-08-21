package lesson4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //list primitive
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("asd"); //0
//        strings.add("qwe"); //1
//        strings.add("zxc"); //2
//        // ArrayList це массив в якому всі елементи вілразу отримуюють індекси
//        // модифікація такого масиву тягне за собою переіндексацію
//        // коли обєктів багато процес переіндексації юбуде займати час
//
//        List<String> strings1  = new LinkedList<>();
//        strings1.add("one");
//        strings1.add("two");
//        strings1.add("three");
//        // Ланкований список. елементи не мають індексів але знає своїх сусідів. Двонаправлений звязок
//
//        // ArrayList зручний якщо ви знаєте індекс
//        // LinkedList зручно модифікувати додавати чи модифікувати (немає переіндексації)
//        // але для видалення н-д 100-го елемента потрібно самому ітерувати його до сотого але переіндексація це процем більш затратний
//        strings1.remove("two");
//        System.out.println(strings1); //[one, three]
//
//        strings1.remove(1);
//        System.out.println(strings1); //[one]
//
//
//        strings1.add("qqq");
//        strings1.add("qqq");
//        System.out.println(strings1); //[one, qqq, qqq] однакові додає
//        strings1.remove("qqq");
//        System.out.println(strings1); // [one, qqq] видаляє перше входження
        //list users
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Rue"));
        users.add(new User(2, "Tue"));
        User due = new User(3, "Due");
        users.add(due);
        users.add(new User(5, "Sue"));
        users.add(new User(4, "Mue"));

        // 2 моменти із видаленням
        // якщо ми видаляємо окремий обєкт то це відбувається і без оверрайда equals
        users.remove(due);
        System.out.println(users);
        // log:
        //[User{id=1, name='Rue'},
        // User{id=2, name='Tue'},
        // User{id=5, name='Sue'},
        // User{id=4, name='Mue'}]
        //Для такого ремува необхідний override equals
        users.remove(new User(1, "Rue"));
        System.out.println(users);
        //log:
//        [User{id=2, name='Tue'},
//        User{id=5, name='Sue'},
//        User{id=4, name='Mue'}]

// addAll removeAll
//        List<User> users1 = new ArrayList<>();
//        users1.add(new User(1, "Rue"));
//        users1.add(new User(2, "Tue"));
//        users1.add(new User(3, "Due"));
//        //addAll додає однакові
//        users.addAll(users1);
//        System.out.println(users);
//
//        users.removeAll(users1);
//        // removeAll судячи з усього шукає всі відповідні обєкти і видаляє навіть обєкти з головного масиву якщо такі ж були у тому який додавали
//        System.out.println(users);
//        // log:
////        [User{id=5, name='Sue'},
////        User{id=4, name='Mue'}]
// ////////////////



        // remove while iterate
// error : Exception in thread "main" java.util.ConcurrentModificationException
        //коли ми видаляємо обєкт під час ітерації жабі не зрозуміло шо робити із індексами тому що ітерація ще не
        //закінчилася а алемент вже видалений
        // так не можна ---
//        for (User user : users) {
//            if (user.getId() == 2){
//                users.remove(user);
//            }
//        }
//        System.out.println(users);

        // правильний варіант --- itit-tab
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User next = iterator.next(); // ОБОВЯЗКОВО вичавити елемент в змінну тому що повторний виклик некст візьме наступний обєкт
            if (next.getId() == 4){
                iterator.remove();  // спец метод якийремувне обєкт в данній позиції некст використовувати тільки його
            }
        }
        System.out.println(users);


//        users.add(due);
//        System.out.println(users);
//        User userDue = users.get(3);
//        System.out.println(userDue.hashCode()); //70130
//        System.out.println(due.hashCode());  //70130
//        System.out.println(new User(3,"Due").hashCode()); //70130
//
//        System.out.println(due); //lesson4.collections.User@111f2
//        System.out.println(userDue); //lesson4.collections.User@111f2
//        System.out.println(new User(3, "Due")); //lesson4.collections.User@111f2
    }
}
