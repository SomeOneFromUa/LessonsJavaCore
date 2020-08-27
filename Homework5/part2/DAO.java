package Homework5.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class DAO {
//    create read update delete
    private ArrayList<Contact> contacts = new ArrayList<>();

    public DAO() {
    }

    public DAO(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    public Stream<Contact> getContacts() {
        return contacts.stream();
    }
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
    public void addList(ArrayList<Contact> list) {
        this.contacts.addAll(list);
    };

    public void readContacts () {
        this.contacts.stream().forEach(contact -> System.out.println(contact));
    }

    public void deleteAll () {
        this.contacts.clear();
    }

    public void deleteContact (String name) {
        int size = this.contacts.size();
        this.contacts.removeIf(next -> next.getName().equals(name));
        if (this.contacts.size() == size){
            System.out.println("name is not found");
        }
    }
}
