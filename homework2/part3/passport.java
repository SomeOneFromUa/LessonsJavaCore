package homework2.part3;

public class passport {
    private String series;
    private int num;
    private String givenBy;

    public passport() {
    }

    public passport(String series, int num, String givenBy) {
        this.series = series;
        this.num = num;
        this.givenBy = givenBy;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getGivenBy() {
        return givenBy;
    }

    public void setGivenBy(String givenBy) {
        this.givenBy = givenBy;
    }

    @Override
    public String toString() {
        return "passport{" +
                "series='" + series + '\'' +
                ", num=" + num +
                ", givenBy='" + givenBy + '\'' +
                '}';
    }
}
