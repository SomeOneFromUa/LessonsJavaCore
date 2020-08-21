package lesson3.interfacesCases.example;

public class IncPrint implements Printera {
    @Override
    public void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
