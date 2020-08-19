package Homework3.part2.task3;

import java.util.ArrayList;

public class CustomRange implements Creator {
    private int length;
    private int x;

    @Override
    public ArrayList<Integer> creator() {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < this.length; i++) {
                  integers.add((int) Math.round(Math.random()*x));
        }
        return integers;
    }

    public CustomRange() {
    }

    public CustomRange(int length, int x) {
        this.length = length;
        this.x = x;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "CustomRange{" +
                "length=" + length +
                ", x=" + x +
                '}';
    }
}
