package Classwork2.part3;

import javax.security.auth.login.AccountExpiredException;
import java.util.ArrayList;

public class User{
    private int id;
    private String name;
    private String login;
    private int age;
    private String password;

    public User() {
    }

    public User(int id, String name, String login, int age, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.age = age;
        this.password = password;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }

}
