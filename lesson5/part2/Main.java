package lesson5.part2;

public class Main {
    public static void main(String[] args) {
//        Нафявність обекту (екземпляру) інтерфейсу визначається реалізацією його абстрактного методу
        Calc calc = new Calc() {
            @Override
            public void calc(int a, int b) {
                System.out.println(a - b);
            }
        };

        calc.calc(4,5); // abstract
        calc.add(6,6);  //  default

        Calc.multiple(5,10); //static

        CustomCalc customCalc = new CustomCalc();
        customCalc.calc(5,8); // implementation of Culc.culc interface abstract method
        customCalc.add(5,5); // default method like with extending

//        Лямбда вираз - синтаксичний цукор
        Calc calc1 = (int a, int b) -> System.out.println(a/b);
        calc1.calc(20,2);

//        якщо є більше одної дії то ми робимо теж шо на жабаскрипті - ставимо фігурні дужки
        Calc calc2 = (a, b) -> {
            int result = a+a + b+b;
            System.out.println(result);
        };
        calc2.calc(5,10);
    }
}
