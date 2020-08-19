package Homework3.part2.task1;

public class Main {
    public static void main(String[] args) {
//Стоврити 4 класи ,які будуть відповідати наступному інтерфейсу
//interface Calculator{
//  void calculate(int a, int b);
//}
        Divide divide = new Divide();
        divide.calculator(10,2);

        CustomCalc customCalc = new CustomCalc(10, 4, divide);
    }
}
