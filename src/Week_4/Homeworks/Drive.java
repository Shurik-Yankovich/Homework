package Week_4.Homeworks;

public interface Drive {

    boolean write(String type, String data);

    boolean read();

    void putOn();

    void putOff();
}
