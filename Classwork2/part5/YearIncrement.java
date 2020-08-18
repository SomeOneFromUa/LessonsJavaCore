package Classwork2.part5;

import java.util.Comparator;

public class YearIncrement implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getYear() - car2.getYear();
    }
}
