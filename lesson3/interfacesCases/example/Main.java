package lesson3.interfacesCases.example;

public class Main {
    public static void main(String[] args) {
CustomPrinter customPrinter = new CustomPrinter(new IncPrint());
System.out.println("-----------------");
CustomPrinter customPrinter2 = new CustomPrinter(new DecPrint());
    }
}
