package Classwork2.part5;

public class Car {
    private String model;
    private int year;
    private String number;
    private String color;
    private Engine engine;
    private Wheel wheel;


    public void changeDiam(double num) {
        this.wheel.setDiameter(this.wheel.getDiameter() + num);
    }

    public Car() {
    }

    public Car(String model, String color, int year, String number, Engine engine, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.engine = engine;
        this.wheel = wheel;
    }

    public Car(String model,
               String color,
               int year,
               String number,
               String EngineModel,
               double EngineVolume,
               int EnginePower,
               String WheelProd,
               double WheelDiam) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.number = number;
        this.engine = new Engine(EngineModel, EngineVolume, EnginePower);
        this.wheel = new Wheel(WheelProd, WheelDiam);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                ", number='" + number + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
