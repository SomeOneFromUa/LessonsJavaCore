package Classwork3.task1;

public class Kvadrat implements Square {
    private double side;
    @Override
    public double square() {
        return this.side* this.side;
    }

    public Kvadrat() {
    }

    public Kvadrat(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Priamokutnyk{" +
                "side=" + side +
                '}';
    }
}
