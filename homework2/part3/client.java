package homework2.part3;

public class client {
    private String name;
    private String surname;
    private String data;
    private passport passport;

    public client() {
    }

    public client(String name, String surname, String data, homework2.part3.passport passport) {
        this.name = name;
        this.surname = surname;
        this.data = data;
        this.passport = passport;
    }
    public client(String name, String surname, String data, String Pseries, int Pnum, String PgivenBy) {
        this.name = name;
        this.surname = surname;
        this.data = data;
        this.passport = new passport(Pseries, Pnum, PgivenBy);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public homework2.part3.passport getPassport() {
        return passport;
    }

    public void setPassport(homework2.part3.passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", data='" + data + '\'' +
                ", passport=" + passport +
                '}';
    }
}
