package homework1;

import java.util.ArrayList;

public class cinderella {
    private String name;
    private int footSize;

    public void addToArr(ArrayList<cinderella> arr) {
        arr.add(this);
    }

    public cinderella() {
    }

    public cinderella(String name, int footSize) {
        this.name = name;
        this.footSize = footSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFootSize() {
        return footSize;
    }

    public void setFootSize(int footSize) {
        this.footSize = footSize;
    }

    @Override
    public String toString() {
        return "cinderella{" +
                "name='" + name + '\'' +
                ", footSize=" + footSize +
                '}';
    }

}
