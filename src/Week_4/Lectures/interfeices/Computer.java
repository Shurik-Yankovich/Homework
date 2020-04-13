package Week_4.Lectures.interfeices;

public class Computer implements Playable {
    @Override
    public void play() {
        System.out.println("Компьютер начал проигрывать музыку.");
    }

    @Override
    public void pause() {
        System.out.println("Компьютер поставил музыку на паузу.");
    }

    @Override
    public void stop() {
        System.out.println("Компьютер остановил проигрывание музыки.");
    }
}
