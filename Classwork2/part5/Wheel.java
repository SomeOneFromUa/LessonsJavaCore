package Classwork2.part5;

public class Wheel {
    private String producer;
    private double diameter;

    public Wheel() {
    }

    public Wheel(String producer, double diameter) {
        this.producer = producer;
        this.diameter = diameter;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "producer='" + producer + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
