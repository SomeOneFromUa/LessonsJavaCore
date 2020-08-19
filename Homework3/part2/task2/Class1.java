package Homework3.part2.task2;

public class Class1 implements Scream {
    private String message = "ууууууууу";
    @Override
    public void scream() {
    System.out.println(this.message);
    }

    public Class1() {
    }

    public Class1(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "class1{" +
                "message='" + message + '\'' +
                '}';
    }
}
