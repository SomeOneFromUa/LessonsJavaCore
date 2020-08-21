package lesson2.part1;

public class main {
    public static void main(String[] args) {
        //два підходи
    calc calculator = new calc();
    calculator.add(4,5);
        int result = calculator.add(56, 77);
        //
        calc2 culcEx = new calc2(59, 60);
        int add = culcEx.minus();
        System.out.println(add);
    }
}
