package Week_3.Week_4.Lectures.interfeices;

public class Smartphone implements Playable {
    @Override
    public void play() {
        System.out.println("Смартфон начал проигрывать музыку.");
    }

    @Override
    public void pause() {
        System.out.println("Смартфон поставил музыку на паузу.");
    }

    @Override
    public void stop() {
        System.out.println("Смартфон остановил проигрывание музыки.");
    }

    @Override
    public void deleteSong(String song) {
        System.out.println(song + " - песня удалена из плейлиста смартфона!");
    }

    @Override
    public void addSong(String song) {
        System.out.println(song + " - песня добавлена в плейлист смартфона!");
    }
}
