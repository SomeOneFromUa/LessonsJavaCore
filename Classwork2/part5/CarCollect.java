package Classwork2.part5;

import java.util.ArrayList;

public class CarCollect {
    private ArrayList<Car> collection;

    public CarCollect() {
    }

    public CarCollect(ArrayList<Car> collection) {
        this.collection = collection;
    }

    public ArrayList<Car> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Car> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "CarCollect{" +
                "collection=" + collection +
                '}';
    }
    public void logCars(){
        for (Car car : collection) {
            System.out.println(car);
        }
        System.out.println("---------------------------");
    }
}
