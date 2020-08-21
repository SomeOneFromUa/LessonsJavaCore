package Classwork2.part4;

import homework2.part1.Pat;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zooclub {
    private HashMap<Person, ArrayList<Pet>> club = new HashMap<>();

    //1) додати учасника в клуб;
    public void addPerson(Person person) {
        club.put(person, new ArrayList<>());
    }
    //2) додати тваринку до учасника клубу.
    public void addPatToPerson(Person person, Pet pet) {
        this.club.get(person).add(pet);
    }
    //3) видалити тваринку з власника.
    public void removePetFromPerson(Person person, Pet pet){
        this.club.get(person).remove(pet);
    }
    //4) видалити учасника клубу.
    public void removePerson(Person person) {
        this.club.remove(person);
    }
    //5) видалити конкретну тваринку з усіх власників.
    public void removePet(Pet pet) {
        for (Person person : club.keySet()) {
            this.club.get(person).remove(pet);
        }
    }
    public void log() {
        for (Map.Entry entry : club.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("----------------");
        }
    }
    public Zooclub() {
    }


    public Zooclub(HashMap<Person, ArrayList<Pet>> club) {
        this.club = club;
    }

    public HashMap<Person, ArrayList<Pet>> getClub() {
        return club;
    }

    public void setClub(HashMap<Person, ArrayList<Pet>> club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }
}
