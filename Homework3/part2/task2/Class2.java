package Homework3.part2.task2;

public class Class2 implements Scream {
    private String message = "аааааааа!!!!!";
    
    @Override
    public void scream() {
        System.out.println(this.message);
    }

    public Class2() {
    }

    public Class2(String message) {
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
        return "class2{" +
                "message='" + message + '\'' +
                '}';
    }
}
