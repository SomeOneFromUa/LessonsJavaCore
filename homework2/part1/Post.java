package homework2.part1;

public class Post {
    private String site;
    private String login;
    private String password;

    public Post() {
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Post(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Post{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public void login(String login, String password, String name) {
        if (login == this.login && password == this.password) {
            System.out.println("you are signed in" + " welcome " + name );
        } else System.out.println("wrong login or password");
    }
}
