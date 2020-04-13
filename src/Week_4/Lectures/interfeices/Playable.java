package Week_4.Lectures.interfeices;

public interface Playable {

    void play();

    void pause();

    void stop();

    default void deleteSong(String song) {
        System.out.println(song + " - песня удалена из плейлиста!");
    }

    default void addSong(String song) {
        System.out.println(song + " - песня добавлена в плейлист!");
    }
}
