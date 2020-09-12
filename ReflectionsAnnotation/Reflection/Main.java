package ReflectionsAnnotation.Reflection;

import ReflectionsAnnotation.Uzer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
//        two ways:
        Uzer uzer = new Uzer(1, "vasya", 22);
//        1
        Class<? extends Uzer> aClass = uzer.getClass();
        Class<? extends Uzer> aClass1 = uzer.getClass();

        Field[] declaredFields = aClass.getDeclaredFields();
//        System.out.println("method declaredFields():");
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }
        System.out.println("-----------");
        Field[] fields = aClass.getFields();
//        System.out.println("methdod fields():");
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//
//        method fields() вертає всі поля в батьку і дочках тільки якщо вони публічні

//        method declaredFields(): вертає всі моля незалежно від модифікатора доступу
//        але тільки в класі на якому був викликаний



        //Exception in thread "main" java.lang.IllegalAccessException - отримаємо якщо поле приватне
//        System.out.println(uzer);
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);//але ми можемо це обійти
//            System.out.println(declaredField.getName()  + " " + declaredField.get(uzer));
//            // також ми спроможні сетати поля а не тільки гетати
//            if (declaredField.getType().equals(String.class)) {
//                declaredField.set(uzer, "Another name");
//            }
//        }
//        System.out.println(uzer);


        //окрім полів ми спроможні доставати і методи
        // declaredFields - вертає в тому числі і оверрайднуті методи
//        System.out.println(uzer);
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
////            System.out.println(declaredMethod.getName());
//            // можні методи викликати
//            if (declaredMethod.getName().equals("setAge")){
//                declaredMethod.invoke(uzer, 34);
//            }
//        }
//        System.out.println(uzer);



        // може використовуватися для валідації
        // invoke методів

        // на цих штуках працюють у фрейворках

        // getType - тільки для обєктів класу field
        // class or getClass - для обєктів
        // getRuturnType - тип повертаємого значення для методу

        // Рефлексія - механізм за допомогою якого ми спроможні доступитися до всього що є в конкретному класі


        //                       Anotation

        Uzer uzer1 = new Uzer(1, "test", -2);// вальне помилку валідатор
        System.out.println(uzer1);

    }
}
