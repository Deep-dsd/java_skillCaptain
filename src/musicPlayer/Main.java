package musicPlayer;

public class Main {
    public  static  void main(String[] args){
        MyMusicPlayer spotify = new MyMusicPlayer();
        spotify.addSong("yesterday");
        spotify.addSong("here comes the sun");
        spotify.addSong("nothing else matters");
        spotify.addSong("comfortably numb");
        spotify.addSong("norwegian wood");
        spotify.play();
        spotify.showPlaylist();


    }
}

