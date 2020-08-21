package homework2.part3;

public class motion {
    private int number;
    private String data;
    private String type;
    private client client;

    public motion() {
    }

    public motion(int number, String data, String type, homework2.part3.client client) {
        this.number = number;
        this.data = data;
        this.type = type;
        this.client = client;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public homework2.part3.client getClient() {
        return client;
    }

    public void setClient(homework2.part3.client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "motion{" +
                "number=" + number +
                ", data='" + data + '\'' +
                ", type='" + type + '\'' +
                ", client=" + client +
                '}';
    }
}
