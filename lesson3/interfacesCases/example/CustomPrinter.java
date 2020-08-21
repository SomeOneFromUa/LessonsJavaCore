package lesson3.interfacesCases.example;

public class CustomPrinter {
    int[] arr = {4, 6, 2, 5, 7, 8};

    public CustomPrinter(Printera printera) {
        printera.print(this.arr);
    }
}
