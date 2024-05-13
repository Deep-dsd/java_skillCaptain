package musicPlayer;

public interface MusicPlayer {
    void play();
    void pause();

    void nextSong();
    void prevSong();

    void stop();

    void addSong(String song);

    void removeSong(String song);

    void showPlaylist();

    void shufflePlaylist();



}
