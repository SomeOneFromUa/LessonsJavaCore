package lesson5.part2;

public interface Calc {
//    Цей метод буде необхідно імплементувати
    void calc(int a, int b);
// це як і звичайний метод - буде доступний з-під екзепляра
  default void add (int a, int b) {
System.out.println(a + b);
    }
//    цей метод буде доступний без екземпляра і відразу через Calc.multiple()
    static void multiple(int a, int b) {
      System.out.println(a*b);
    }
}
