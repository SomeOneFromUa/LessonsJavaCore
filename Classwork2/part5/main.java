package Classwork2.part5;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
//Створити колекцію авто яка буде посортивана за роком випуску
        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Model1", "black", 2000, "ah5334", "Qw3", 2.4, 2000, "china", 30),
                new Car("Model2", "Red", 1999, "ac3334", "Qw2", 2.5, 4000, "russia", 30),
                new Car("Model3", "White", 2010, "ac2314", "QE5", 1.5, 3000, "china", 25),
                new Car("Model4", "black", 1990, "ac3634", "Xdpi", 2, 2500, "china", 40),
                new Car("Model5", "Metal", 1995, "ar4335", "Fr40", 2.3, 2000, "poland", 25),
                new Car("Model6", "Pink", 2001, "ar4344", "Qe22", 1.3, 4000, "china", 32),
                new Car("Model7", "yellow", 1950, "ac1334", "DPI4", 2, 2800, "USA", 31),
                new Car("Model8", "black", 1997, "ac4434", "En55", 1.5, 4000, "china", 35),
                new Car("Model9", "White", 2015, "ae3332", "Qw2", 3, 2400, "china", 23),
                new Car("Model10", "Blue", 2001, "ac4444", "Qw2", 2.4, 1800, "china", 15)
        ));
        CarCollect carCollection = new CarCollect(cars);
        ArrayList<Car> collection = carCollection.getCollection();
//        carCollection.logCars();
        //Пройтись по коллекції, всі автівки які меньше 2000 року
        // змінити радіус колеса на одн меньше від поточного
        for (Car car : collection) {
            if (car.getYear() < 2000) {
                car.changeDiam(-1);
            }
        }
//        carCollection.logCars();
//всі автівки які старіше 2000 року пепефарбувати в зелений
        for (Car car : collection) {
            if (car.getYear() > 2000) {
                car.setColor("green");
            }
        }
//        carCollection.logCars();

        //Пройтись по коллекції, всі автівки які меньше 2000 року
//скопіювати в окоему коллекцію, яка буде посортована
//по року автівок в зростанні
        ArrayList<Car> cars1 = new ArrayList<>();
        for (Car car : collection) {
            if (car.getYear() < 2000){
                cars1.add(car);
            }
        }
        CarCollect belove2000 = new CarCollect(cars1);
        System.out.println("before sort");
        belove2000.logCars();

        belove2000.getCollection().sort(new YearIncrement());
        System.out.println("after sort");
        belove2000.logCars();

//Всі автівки, старіше 2000 року скопіювати в коллекцію ,
//яка буде посортована по року та спаданню
        ArrayList<Car> cars2 = new ArrayList<>();
        for (Car car : collection) {
            if (car.getYear() > 2000){
                cars2.add(car);
            }
        }
        CarCollect above2000 = new CarCollect(cars2);
        System.out.println("before sort");
        above2000.logCars();

        System.out.println("after sort");
        above2000.getCollection().sort(new YearDecrement());
        above2000.logCars();
    }
}
