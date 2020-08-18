package Classwork2.part3;

import java.util.ArrayList;

public class Custom {
    public ArrayList<User> union(ArrayList<Person> people, ArrayList<Auth> auths) {
        ArrayList<User> arr = new ArrayList<>();
        for (Person person : people) {
            for (Auth auth : auths) {
                if (person.getId() == auth.getId()) {
                    User user = new User(person.getId(), person.getName(), auth.getLogin(), person.getAge(), auth.getPassword());
                    arr.add(user);
                }
            }
        }
        return arr;
    }
}
