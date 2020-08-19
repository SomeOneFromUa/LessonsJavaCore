package Homework3.part1.task4;

import java.util.ArrayList;

public class WorkStation extends Computer {
    private Boolean MultipleProcessorSocketMultiple;
    private Boolean MultipleDisplays;
    private ArrayList<String> ProfSoft;

    public WorkStation() {
    }

    public WorkStation(String core, String RAM, String motherboard, String system, Boolean multipleProcessorSocketMultiple, Boolean multipleDisplays, ArrayList<String> profSoft) {
        super(core, RAM, motherboard, system);
        MultipleProcessorSocketMultiple = multipleProcessorSocketMultiple;
        MultipleDisplays = multipleDisplays;
        ProfSoft = profSoft;
    }

    public Boolean getMultipleProcessorSocketMultiple() {
        return MultipleProcessorSocketMultiple;
    }

    public void setMultipleProcessorSocketMultiple(Boolean multipleProcessorSocketMultiple) {
        MultipleProcessorSocketMultiple = multipleProcessorSocketMultiple;
    }

    public Boolean getMultipleDisplays() {
        return MultipleDisplays;
    }

    public void setMultipleDisplays(Boolean multipleDisplays) {
        MultipleDisplays = multipleDisplays;
    }

    public ArrayList<String> getProfSoft() {
        return ProfSoft;
    }

    public void setProfSoft(ArrayList<String> profSoft) {
        ProfSoft = profSoft;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "MultipleProcessorSocketMultiple=" + MultipleProcessorSocketMultiple +
                ", MultipleDisplays=" + MultipleDisplays +
                ", ProfSoft=" + ProfSoft +
                '}';
    }
}
