package Homework3.part1.task4;

public class Computer {
    private String core;
    private String RAM;
    private String Motherboard;
    private String System;

    public Computer() {
    }

    public Computer(String core, String RAM, String motherboard, String system) {
        this.core = core;
        this.RAM = RAM;
        Motherboard = motherboard;
        System = system;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getMotherboard() {
        return Motherboard;
    }

    public void setMotherboard(String motherboard) {
        Motherboard = motherboard;
    }

    public String getSystem() {
        return System;
    }

    public void setSystem(String system) {
        System = system;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "core='" + core + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Motherboard='" + Motherboard + '\'' +
                ", System='" + System + '\'' +
                '}';
    }
}
