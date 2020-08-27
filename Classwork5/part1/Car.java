package Classwork5.part1;

import java.util.Objects;

public class Car {
    private int id;
    private String mark;
    private int power;
    private int cost;
    private int year;
    private Driver driver;

    public void repair() {
        int pow = this.power;
        this.power = (int) (pow + ( pow*0.1));
    }
    public void increaseCost(int persent) {
        int priorCost = this.cost;
        this.cost = priorCost + (int)(priorCost * ((double) persent/100));
    }
    public Car() {
    }

    public Car(int id, String mark, int power, int cost, int year) {
        this.id = id;
        this.mark = mark;
        this.power = power;
        this.cost = cost;
        this.year = year;
    }
    public Car(int id, String mark, int power, int cost, int year, Driver driver) {
        this.id = id;
        this.mark = mark;
        this.power = power;
        this.cost = cost;
        this.year = year;
        this.driver = driver;
    }
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.power, power) == 0 &&
                cost == car.cost &&
                year == car.year &&
                mark.equals(car.mark) &&
                driver.equals(car.driver) &&
                id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, power, driver, cost, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                "id='" + id +
                ", power=" + power +
                ", driver=" + driver +
                ", cost=" + cost +
                ", year=" + year +
                '}';
    }
}
