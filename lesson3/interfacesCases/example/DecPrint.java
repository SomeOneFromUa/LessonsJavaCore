package lesson3.interfacesCases.example;

public class DecPrint implements Printera {
    @Override
    public void print(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
           System.out.println(arr[i]);
        }
    }
}
