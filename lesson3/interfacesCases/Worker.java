package lesson3.interfacesCases;

public class Worker implements Singer {
    private String name;
    private String company;
    private int exp;

    public Worker() {
    }

    public Worker(String name, String company, int exp) {
        this.name = name;
        this.company = company;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", exp=" + exp +
                '}';
    }

    //implementation of method in intrerface
    @Override
    public void sing() {
        System.out.println("hello darkness my old friend...");
    }
}
