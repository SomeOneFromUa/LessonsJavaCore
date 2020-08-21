package lesson2.delgationAndEntend;

public class main {
    public static void main(String[] args) {
        //Якщо треба доступитися до методу вложеному в екземплярі класу то потрібно
        //витягувати цей обєкт через геттер
        Engine engine1 = new Engine(1, 3);
        Car car1 = new Car(1, "legasy", engine1);
        Engine engine = car1.getEngine();
        engine.start();
        // або ж реалізувати метод який доступається до вложеного екземпляру із класу так як приватні поля
        // доступні в тілі класу і вернути в ньому метод (поведінку) вложеного екземпляру
        // тобто ми робимо обгортку (прокидуємо)
        car1.start();

        //зміна х-стик вложеного оюєкта
        Engine engineForSet = car1.getEngine();
        engineForSet.setVolume(engineForSet.getVolume()+ 4);
        System.out.println(car1);

        //розштрення + override батьківського методу ctrl+o
        Supercar supercar = new Supercar(1, "modelX", new Engine(66, 4), true );
        supercar.start();


    }
}
