package lesson3.AbstractClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // абстрактний клас теж вимагає реалізацію абстрактного методу в класі якій екстендиться але
        // він такаж має поля які будуть лоступні в дочірньому класі як при звичайному розширенні
        // наслідувати можна тільки тільки раз
        // через дямбду реалізувати не вийде
        SmsngTablet smsngTablet = new SmsngTablet();
        ArrayList<Tablet> tablets = new ArrayList<>(Arrays.asList(
                new Ipad(),
                smsngTablet
        ));
        Tablet tablet = tablets.get(1);
        tablet.startScreen(); // метод android не доступний в лісті таблетів
        smsngTablet.android();

    }
}
