package lesson5.part2;

public class CustomCalc implements Calc {
    private int a;
    private int b;

    public CustomCalc() {
    }

    public CustomCalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calc(int a, int b) {
        System.out.println(a+b-b + " --- a+b-b");
    }
}
