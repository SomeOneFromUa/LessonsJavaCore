package Homework4.list;

import java.util.Collection;
import java.util.Objects;

public class Computer {
    private String model;
    private int year;
    private int memory;
    private int cost;
    private HardDrive hardDrive;
    private CPU cpu;

    public Computer() {
    }

    public Computer(String model, int year, int memory, int cost, HardDrive hardDrive, CPU cpu) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.cost = cost;
        this.hardDrive = hardDrive;
        this.cpu = cpu;
    }
    public Computer(String model,
                    int year,
                    int memory,
                    int cost,
                    String hdModel,
                    Type hdType,
                    int hdMemory,
                    MadeIn hdMadein,
                    String cpuType,
                    int cpuCores,
                    double cpuFrequency,
                    MadeIn cpuMadein
                    ) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.cost = cost;
        this.hardDrive = new HardDrive(hdModel, hdType, hdMemory, hdMadein);
        this.cpu = new CPU(cpuType, cpuCores, cpuFrequency, cpuMadein);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", cost=" + cost +
                ", hardDrive=" + hardDrive +
                ", cpu=" + cpu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return year == computer.year &&
                memory == computer.memory &&
                cost == computer.cost &&
                model.equals(computer.model) &&
                hardDrive.equals(computer.hardDrive) &&
                cpu.equals(computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, memory, cost, hardDrive, cpu);
    }
}
