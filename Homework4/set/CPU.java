package Homework4.set;

import java.util.Objects;

public class CPU {
    private String type;
    private int cores;
    private double frequency;
    private MadeIn madeIn;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public MadeIn getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(MadeIn madeIn) {
        this.madeIn = madeIn;
    }

    public CPU(String type, int cores, double frequency, MadeIn madeIn) {
        this.type = type;
        this.cores = cores;
        this.frequency = frequency;
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "type='" + type + '\'' +
                ", cores=" + cores +
                ", frequency=" + frequency +
                ", madeIn=" + madeIn +
                '}';
    }

    public CPU() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return cores == cpu.cores &&
                Double.compare(cpu.frequency, frequency) == 0 &&
                type.equals(cpu.type) &&
                madeIn == cpu.madeIn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cores, frequency, madeIn);
    }
}
