package Week_3.Week_4.Lectures.interfeices;

public class Player implements Playable {
    @Override
    public void play() {
        System.out.println("Плеер начал проигрывать музыку.");
    }

    @Override
    public void pause() {
        System.out.println("Плеер поставил музыку на паузу.");
    }

    @Override
    public void stop() {
        System.out.println("Плеер остановил проигрывание музыки.");
    }
}
