package lesson2.delgationAndEntend;

public class Engine {
    private int id;
    private int volume;

    public Engine() {
    }

    public Engine(int id, int volume) {
        this.id = id;
        this.volume = volume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", volume=" + volume +
                '}';
    }
    public void start() {
        System.out.println(this.toString() + "was started");
    }
}
