package ReflectionsAnnotation;

import java.lang.reflect.Field;

public final class Validator {
    public static void validateInt(Class<?> someClass, Object o) throws IllegalAccessException { // приймає клас і обєкт цього класу
        Field[] declaredFields = someClass.getDeclaredFields();   //витягує поля (всі які є в данному класі)
        for (Field declaredField : declaredFields) { // ітерує їх
            // так як наш ітератор працює з числами перевіряємо на int
            // і що саме головне перевіряємо чи висить над нашим полем анотація (isAnnotationPresent)
            if (declaredField.getType().equals(int.class) && declaredField.isAnnotationPresent(ValidatorInt.class)){
                declaredField.setAccessible(true); // робимо поля доступними для перевірки (якщо нам необхідно їх змінювати!!)
                ValidatorInt annotation = declaredField.getAnnotation(ValidatorInt.class); // Витягуємо валідатор із конкретними значеннями для цього класу
                int anInt = declaredField.getInt(o); // витягуємо значення нашого поля для перевірки з конкретного обєкту
                String name = declaredField.getName(); // для гнучкості виводу помилки я витягнув і назву поля
                if (anInt < annotation.min() || anInt > annotation.max()) { // для анотації визначений певний діапазон значень які ми витягуємо через її ф-ї
                    throw new NotValidAge( name +" must be in range: " + annotation.min() + " - " + annotation.max()); // виводимо помилку наприклад або ж
                    // сетаємо якесь інше значення
//                    declaredField.set(o, 33);
                }
            }
        }
    }
}
