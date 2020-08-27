package Homework5.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//          Створити класс Контакт
//  -id
//  -name
//  -company (Enum -> Intel, Microsoft, Apple)
//  -surname
//  -email
//  -phone
//  -department (Enum -> tech, support , factory)
//  Створити DAO -прошарок з CRUD операціями, які будуть записувати
//  контакти до БД (в данному випадку у LinkedList)
//  -Створити 10 конатків (2 з яких будуть однаковими)
        //  -занести їх в базу.  
        DAO contactsList = new DAO(new ArrayList<>(Arrays.asList(
                new Contact(7, "Jack", Company.INTEL, "Jax", "jaxxx@com", "09763436", Department.SUPPORT),
                new Contact(2, "John", Company.INTEL, "Doe", "deadman@com", "096536236", Department.SUPPORT),
                new Contact(4, "Bob", Company.MICROSOFT, "Sponge", "bob@com", "097634444", Department.FACTORY),
                new Contact(3, "Jane", Company.INTEL, "Doe", "june@com", "097633346", Department.FACTORY),
                new Contact(4, "Bob", Company.MICROSOFT, "Sponge", "bob@com", "097634444", Department.FACTORY),
                new Contact(6, "Jill", Company.APPLE, "Doe", "jillian@com", "096663336", Department.TECH),
                new Contact(1, "Rue", Company.APPLE, "Somebody", "rue@com", "097636236", Department.TECH),
                new Contact(1, "Rue", Company.APPLE, "Somebody", "rue@com", "097636236", Department.TECH),
                new Contact(5, "Anna", Company.INTEL, "Karenian", "anna@com", "096636236", Department.FACTORY),
                new Contact(8, "Jon", Company.MICROSOFT, "Snow", "targarien@com", "36363236", Department.FACTORY)
        )));

//  -знайти всі унікальні контакти
        List<Contact> collect = contactsList.getContacts().distinct().collect(Collectors.toList());
//        collect.stream().forEach(contact -> System.out.println(contact));

//  -знайти всі унікальні контакти з певного департаменту.
        List<Contact> collectFactory = contactsList.getContacts().filter(contact -> contact.getDepartment() == Department.FACTORY).distinct()
                .collect(Collectors.toList());
//        collectFactory.stream().forEach(contact -> System.out.println(contact));

//  -знайти всі унікальні контакти з певного департаменту
//  посортувавши їх по імейлу .
        List<Contact> collectFactoryEmail = contactsList.getContacts().filter(contact -> contact.getDepartment() == Department.FACTORY)
                .distinct()
                .sorted((contact, t1) -> contact.getEmail().compareTo(t1.getEmail()))
                .collect(Collectors.toList());
//        collectFactoryEmail.stream().forEach(contact -> System.out.println(contact));
//
//  -знайти всі унікальні контакти згрупувавши їх по компанії !!!!
        contactsList.getContacts()
                .distinct()
                .collect(Collectors.groupingBy(contact -> contact.getCompany()))
                .forEach((company, contacts1) -> {
                    System.out.println(company + ":");
                    contacts1.stream().forEach(contact -> System.out.println(contact));
                    System.out.println("-------------------");
                });

//        contactsList.deleteContact("Rue2");
    }
}
