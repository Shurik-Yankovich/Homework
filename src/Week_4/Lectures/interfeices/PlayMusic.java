package Week_4.Lectures.interfeices;

public class PlayMusic {

    public Playable[] playables;

    public PlayMusic(Playable ...playables) {
        this.playables = playables;
    }

    public void playAll() {
        for (Playable playable : playables) {
            playable.play();
        }
        System.out.println();
    }

    public void pauseAll() {
        for (Playable playable : playables) {
            playable.pause();
        }
        System.out.println();
    }

    public void stopAll() {
        for (Playable playable : playables) {
            playable.stop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Playable[] playables = new Playable[4];
        playables[0] = new Smartphone();
        playables[1] = new Computer();
        playables[2] = new Player();
        playables[3] = new Smartphone();

        PlayMusic playMusics = new PlayMusic(playables);

        playMusics.playAll();
        playMusics.pauseAll();
        playMusics.playAll();
        playMusics.stopAll();

        playables[0].addSong("Numb");
        playables[0].addSong("In the end");
    }
}
