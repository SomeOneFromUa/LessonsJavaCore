package lesson2.AgregCompose;

public class company {
    private String name;
    private String catchPgrase;
    private String bs;

    public company() {
    }

    public company(String name, String catchPgrase, String bs) {
        this.name = name;
        this.catchPgrase = catchPgrase;
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPgrase() {
        return catchPgrase;
    }

    public void setCatchPgrase(String catchPgrase) {
        this.catchPgrase = catchPgrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "company{" +
                "name='" + name + '\'' +
                ", catchPgrase='" + catchPgrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
