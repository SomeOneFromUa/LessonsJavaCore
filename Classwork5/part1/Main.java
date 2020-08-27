package Classwork5.part1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Створити обєкт автомобіля з полями:
//Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля теж має бути обєкт, у якого є поля
//Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
        Driver driver1 = new Driver("Rue", 23, 5);
        Driver driver2 = new Driver("Mark", 19, 1);
        Driver driver3 = new Driver("John", 30, 3);
        Driver driver4 = new Driver("Anna", 21, 2);
        Driver driver5 = new Driver("Bob", 25, 6);
        Driver driver6 = new Driver("Jane", 27, 4);
        Driver driver7 = new Driver("Alex", 40, 18);
        Driver driver8 = new Driver("Kate", 20, 2);

        Cars cars = new Cars(new ArrayList<>(Arrays.asList(
                new Car(1,"peugeot", 2000, 6000, 2010),
                new Car(2,"renault", 2200, 4000, 2000, driver5),
                new Car(3,"peugeot", 3000, 5500, 2006,driver6),
                new Car(4,"smart", 3500, 12000, 2018),
                new Car(5,"honda", 3000, 9000, 2015, driver8),
                new Car(6,"audi", 3000, 6000, 2008),
                new Car(7,"volvo", 2000, 5000, 2000, driver7),
                new Car(8,"mercedes", 3000, 10000, 2012),
                new Car(9,"peugeot", 3500, 8000, 2010, driver2),
                new Car(10,"mazda", 2000, 5000, 2005, driver4)
        )
        ));
//Зробили половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
        cars.getCars().stream().forEach(car -> {
            if (car.getId() % 2 == 0){
                car.repair();
            }
        });
//        cars.toString();
//На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
        List<Car> collect = cars.getCars().stream().filter(car -> car.getId() % 2 == 0).collect(Collectors.toList());
//        for (Car car : collect) {
//            System.out.println(car);
//        }
        collect.get(0).setDriver(driver1);
        collect.get(1).setDriver(driver5);
        collect.get(2).setDriver(driver3);
        collect.get(3).setDriver(driver4);
        collect.get(4).setDriver(driver3);
//        cars.toString();
//        System.out.println("--------------");


//Для початку вкладіть всі наші створені автомобілі в масив cars.

//Далі необхідно рати кожну другу машинку (цикл з кроком в 2), та робити їй підвищення потужності двигуна на 10% та ціну на 5%
        for (int i = 0; i < cars.getCars().size(); i+=2) {
            Car car = cars.getCars().get(i);
            car.repair();
            car.increaseCost(5);
        }
//        cars.toString();
//Після того зробити перевірку досвіду ВСІХ наших водіїв. Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
        cars.getCars().stream().map(car -> car.getDriver())
                .filter(driver -> driver != null)
                .distinct()
                .forEach(driver -> {
                    if (driver.getExperience() < 5 && driver.getAge() > 25) {
                        System.out.println(driver);
                        driver.increaseExperience(1);
                        System.out.println(driver);
                        System.out.println("----------");
                    }
                });
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі
        Optional<Integer> reduced = cars.getCars().stream().map(car -> car.getCost()).reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduced.get());
    }
}
