package lesson4.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Set HashSet не допускають однакових оюєктів -- обєкти повинні мати згенерований hashCode метод
        // обєкти перевіряються по їх числовим представлення - хешкодам (адже так тупо простіше)
        // хеш код не зберігає ваш порядок там свої правила (LinkedHashSet - зберігає порядок)
        // це найшвидша колекція через хешкоди
//        Set<User> users = new HashSet<>();
//        users.add(new User(1, "Rue", false));
//        users.add(new User(2, "Tue", true));
//        users.add(new User(3, "Due", true));
//        users.add(new User(5, "Sue", false));
//        users.add(new User(4, "Mue", true));
//        users.add(new User(9, "Vue", true));
//        users.add(new User(10, "Pue", false));
//        users.add(new User(6, "Cue", true));
//        users.add(new User(8, "Nue", false));
//        users.add(new User(7, "Zue", true));


        // для цього сета без імплементації методу випаде помилка ClassCastException - implements Comparable<User>
        // це сортуваня
        Set<User> users1 = new TreeSet<>();
        users1.add(new User(1, "Rue", false));
        users1.add(new User(2, "Tue", true));
        users1.add(new User(3, "Due", true));
        users1.add(new User(5, "Sue", false));
        users1.add(new User(4, "Mue", true));
        users1.add(new User(9, "Vue", true));
        users1.add(new User(9, "Pue", false));
        users1.add(new User(6, "Cue", true));
        users1.add(new User(8, "Nue", false));
        users1.add(new User(7, "Zue", true));
        System.out.println(users1);
        for (User user : users1) {
            System.out.println(user);
        }
        // обєкти з однаковими айдішками - буде братися тільки один - тому потрібно прописувати логіку далі на інші поля
        // тут нема метода гет тому треба ітерувати все і діставати по умові
        //ітератор тут теж працює (так як клас ітератор є глобальним і стоїть над колекціями)
    }
}
