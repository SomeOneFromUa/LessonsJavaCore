package Homework3.part1.task4;

public class UltraBook extends Laptop {
    private double thickness;

    public UltraBook() {
    }

    public UltraBook(String core, String RAM, String motherboard, String system, String size, double weight, Boolean itegratedVideocard, String batteryType, String displayType, double thickness) {
        super(core, RAM, motherboard, system, size, weight, itegratedVideocard, batteryType, displayType);
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "UltraBook{" +
                "thickness=" + thickness +
                '}';
    }
}
