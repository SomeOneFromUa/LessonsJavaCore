package Homework4.list;

import java.util.Objects;

public class HardDrive {
    private String model;
    private Type type;
    private int memory;
    private MadeIn madeIn;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    public HardDrive() {
    }

    public HardDrive(String model, Type type, int memory, MadeIn madeIn) {
        this.model = model;
        this.type = type;
        this.memory = memory;
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", memory=" + memory +
                ", madeIn=" + madeIn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return memory == hardDrive.memory &&
                model.equals(hardDrive.model) &&
                type == hardDrive.type &&
                madeIn == hardDrive.madeIn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, memory, madeIn);
    }
}
