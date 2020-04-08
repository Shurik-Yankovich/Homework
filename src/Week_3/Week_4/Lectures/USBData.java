package Week_3.Week_4.Lectures;

public class USBData {

    private String data;
    public DataType dataType;
    public boolean status = false;

    public String getData() {
        return data;
    }

    public void setData(String type, String data) {
        this.data = data;
        this.dataType = DataType.valueOf(type);
    }
}
