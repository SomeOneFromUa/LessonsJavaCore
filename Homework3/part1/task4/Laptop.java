package Homework3.part1.task4;

public class Laptop extends PersonalComputer {
    private Boolean itegratedVideocard;
    private String batteryType;
    private String displayType;

    public Laptop() {
    }

    public Laptop(String core, String RAM, String motherboard, String system, String size, double weight, Boolean itegratedVideocard, String batteryType, String displayType) {
        super(core, RAM, motherboard, system, size, weight);
        this.itegratedVideocard = itegratedVideocard;
        this.batteryType = batteryType;
        this.displayType = displayType;
    }

    public Boolean getItegratedVideocard() {
        return itegratedVideocard;
    }

    public void setItegratedVideocard(Boolean itegratedVideocard) {
        this.itegratedVideocard = itegratedVideocard;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "itegratedVideocard=" + itegratedVideocard +
                ", batteryType='" + batteryType + '\'' +
                ", displayType='" + displayType + '\'' +
                '}';
    }
}
