package Classwork5.part1;

import java.util.ArrayList;

public class Cars {
    private ArrayList<Car> cars;

    private void addCar(Car car) {
        this.cars.add(car);
    }

    public Cars() {
    }

    public Cars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public String toString() {
        this.cars.stream().forEach(car -> System.out.println(car));
        return "cars:";
    }
}
