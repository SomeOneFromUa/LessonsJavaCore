package Homework3.part2.task3;

import java.util.ArrayList;

public class ConstRange implements Creator {
    private int length;
    @Override
    public ArrayList<Integer> creator() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < this.length; i++) {
            integers.add((int) Math.round(Math.random()* Creator.range));
        }
        return integers;
    }

    public ConstRange() {
    }

    public ConstRange(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "ConstRange{" +
                "length=" + length +
                '}';
    }
}
