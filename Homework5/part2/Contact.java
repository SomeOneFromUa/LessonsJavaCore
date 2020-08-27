package Homework5.part2;

import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private Company company;
    private String surname;
    private String email;
    private String number;
    private Department department;

    public Contact() {
    }

    public Contact(int id, String name, Company company, String surname, String email, String number, Department department) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.surname = surname;
        this.email = email;
        this.number = number;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id &&
                name.equals(contact.name) &&
                company == contact.company &&
                surname.equals(contact.surname) &&
                email.equals(contact.email) &&
                number.equals(contact.number) &&
                department == contact.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, company, surname, email, number, department);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company=" + company +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", department=" + department +
                '}';
    }
}
