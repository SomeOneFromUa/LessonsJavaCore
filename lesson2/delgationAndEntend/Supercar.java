package lesson2.delgationAndEntend;

public class Supercar extends Car {
    private boolean turbo;

    public Supercar() {
    }

    public Supercar(int id, String model, Engine engine, boolean turbo) {
        super(id, model, engine);
        this.turbo = turbo;
    }

    @Override
    public void start() {
        System.out.println(this.getModel() + "engine - " + this.getEngine() + "started/ wrum-wrum");
    }

}
