package Classwork2.part4;

import homework2.part1.Pat;

import java.util.*;

public class main {
    public static void main(String[] args) {
//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
// В мейн методі створити меню, яке буде реалізовувати наступні функції:
        Zooclub zooclub = new Zooclub();

        Person person = new Person("Rue", 1, 22);
        Person person2 = new Person("Mark", 2, 30);
        Person person3 = new Person("Oleg", 3, 18);
        Pet pet1 = new Pet("Vasya");
        Pet pet2 = new Pet("Rex");
        Pet pet3 = new Pet("Boris");
        Pet pet4 = new Pet("Murka");
        Pet pet5 = new Pet("Pes");
        Pet pet6 = new Pet("Doggy");
//1) додати учасника в клуб;
        zooclub.addPerson(person);
        zooclub.addPerson(person2);
        zooclub.addPerson(person3);
//        zooclub.log();
//2) додати тваринку до учасника клубу.
        zooclub.addPatToPerson(person, pet1);
        zooclub.addPatToPerson(person, pet2);
        zooclub.addPatToPerson(person, pet3);
        zooclub.addPatToPerson(person2, pet1);
        zooclub.addPatToPerson(person2, pet4);
        zooclub.addPatToPerson(person3, pet5);
        zooclub.addPatToPerson(person3, pet6);
//        zooclub.log();
//3) видалити тваринку з власника.
        zooclub.removePetFromPerson(person, pet2);
//        zooclub.log();
//4) видалити учасника клубу.
        zooclub.removePerson(person3);
//        zooclub.log();
//5) видалити конкретну тваринку з усіх власників.
        zooclub.removePet(pet1);
//        zooclub.log();
//6) вивести на екран зооклуб.
        zooclub.log();
    }
}
