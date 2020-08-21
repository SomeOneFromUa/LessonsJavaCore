package homework2.part1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Post post;
    private Pat pat;

    public Person() {
    }

    public Person(String name, String surname, int age, Post post, Pat pat) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = post;
        this.pat = pat;
    }

    public Person(String name, String surname, int age, String Psite, String Plogin, String Ppassword, String PatName, int PatAge) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = new Post(Psite, Plogin, Ppassword);
        this.pat = new Pat(PatName, PatAge);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Pat getPat() {
        return pat;
    }

    public void setPat(Pat pat) {
        this.pat = pat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", post=" + post +
                ", pat=" + pat +
                '}';
    }

    public void login(String login, String password) {
        this.post.login(login, password, this.name);
    }
}
