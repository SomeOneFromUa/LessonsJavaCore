package homework1;

import java.util.ArrayList;

public class prince {
    private String name;
    private int searchedFootSize;
    private cinderella love;

    //робота із звичайним массивом
    public void findCinderella(cinderella[] arr) {
        for (cinderella cinderella : arr) {
            if (this.searchedFootSize == cinderella.getFootSize()){
                this.love = cinderella;
            }
        }
    }
    //робота із array list
    public void findInList(ArrayList<cinderella> list) {
        for (cinderella cinderella : list) {
            if (this.searchedFootSize == cinderella.getFootSize()) {
                this.love = cinderella;
            }
        }
    }

    public prince() {
    }

    public prince(String name, int searchedFootSize) {
        this.name = name;
        this.searchedFootSize = searchedFootSize;
    }

    @Override
    public String toString() {
        return "prince{" +
                "name='" + name + '\'' +
                ", searchedFootSize=" + searchedFootSize +
                ", love=" + love +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSearchedFootSize() {
        return searchedFootSize;
    }

    public void setSearchedFootSize(int searchedFootSize) {
        this.searchedFootSize = searchedFootSize;
    }

    public cinderella getLove() {
        return love;
    }

    public void setLove(cinderella love) {
        this.love = love;
    }
}
