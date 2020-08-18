package Classwork2.part5;

import java.util.Comparator;

public class YearDecrement implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car2.getYear() - car1.getYear();
    }
}
