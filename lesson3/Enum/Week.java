package lesson3.Enum;

public enum Week {
    SUNDAY(0), MONDAY(8), TUESDAY(8), WEDNESDAY(8), THURSDAY(8), FRIDAY(8), SATURDAY(8);
    private int workHours;

    Week(int workHours) {
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "Week{" +
                "workHours=" + workHours +
                '}';
    }
}
