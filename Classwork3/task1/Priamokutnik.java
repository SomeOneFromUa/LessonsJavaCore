package Classwork3.task1;

public class Priamokutnik implements Square {
    private double side1;
    private double side2;
    @Override
    public double square() {
        return this.side1 * this.side2;
    }

    public Priamokutnik() {
    }

    public Priamokutnik(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Priamokutnik{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
