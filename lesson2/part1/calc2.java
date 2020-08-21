package lesson2.part1;

public class calc2 {
    private int a;
    private int b;

    public calc2() {
    }

    public calc2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //custom methods//
    public int add() {
        return this.a + this.b;
    }
    public int minus() {
        return this.a - this.b;
    }

    @Override
    public String toString() {
        return "calc2{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
