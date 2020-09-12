package ReflectionsAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// можна сприймати анотації як такий-собі інтерфейс
// для повноцінної роботи потрібно дописати ще дві анотації для цієї анотації
@Retention(RetentionPolicy.RUNTIME)  // на якому етапі вона буде працювати
@Target({ElementType.FIELD, ElementType.METHOD})  // визначає над чим буде стояти анотація
public @interface ValidatorInt {

    int min();

    int max();
}
