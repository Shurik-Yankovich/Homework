package Week_4.Homeworks;

public class USBDrive implements Drive{

    private String data;
    public DataType dataType;
    public boolean status = false;

    @Override
    public boolean write(String type, String data) {
        if (status) {
            this.data = data;
            this.dataType = DataType.valueOf(type);
        }
        return status;
    }

    @Override
    public boolean read() {
        if (status) {
            switch (dataType) {
                case MOVIE:
                    System.out.println("Воспроизводится фильм с названием: " + data);
                    break;
                case AUDIO:
                    System.out.println("Воспроизводится аудио с названием: " + data);
                    break;
                case FILE:
                    System.out.println("Файл содержит: " + data);
                    break;
            }
        }
        return status;
    }

    @Override
    public void putOn() {
        status = true;
    }

    @Override
    public void putOff() {
        status = false;
    }
}
