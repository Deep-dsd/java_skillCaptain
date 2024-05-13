package musicPlayer;

import java.util.ArrayList;
import java.util.Objects;

public class MyMusicPlayer implements MusicPlayer{
    private final ArrayList<String> playList = new ArrayList<>();
    private boolean isPlaying = false;
    private int currentlyPlaying = 0;

    @Override
    public void play() {
        if(!this.playList.isEmpty()){
            if(!this.isPlaying){
                String currentSong = this.playList.get(this.currentlyPlaying).substring(0,1).toUpperCase() + this.playList.get(this.currentlyPlaying).substring(1);
                System.out.println("Playing " + currentSong + ".");
                this.isPlaying = true;
            }
            else{
                this.pause();
            }
        }
        else{
            System.out.println("Please add some song to your playlist.");
        }
    }

    @Override
    public void pause() {
        if(!this.playList.isEmpty()){
            if(this.isPlaying){
                String currentSong = this.playList.get(this.currentlyPlaying).substring(0,1).toUpperCase() + this.playList.get(this.currentlyPlaying).substring(1);
                System.out.println("Pausing " + currentSong + ".");
                this.isPlaying = false;
            }
            else{
                this.play();
            }
        }
        else{
            System.out.println("Please add some song to your playlist.");
        }
    }

    public void nextSong(){
        if(!this.playList.isEmpty()){
            if(this.playList.size() == 1){
                System.out.println("Only one song in the playlist.");
            }
            else{
                this.isPlaying = false;
                if (this.currentlyPlaying == this.playList.size()-1){
                    this.currentlyPlaying = 0;
                }
                else{
                    this.currentlyPlaying += 1;
                }
                this.play();
            }
        }
        else{
            System.out.println("playlist is empty, please add some song.");
        }
    }

    public void prevSong(){
        if(!this.playList.isEmpty()){
            if(this.playList.size() == 1){
                System.out.println("Only one song in the playlist.");
            }
            else{
                this.isPlaying = false;
                if (this.currentlyPlaying == 0){
                    this.currentlyPlaying = this.playList.size()-1;
                }
                else{
                    this.currentlyPlaying -= 1;
                }
                this.play();
            }
        }
        else{
            System.out.println("playlist is empty, please add some song.");
        }
    }

    @Override
    public void stop() {
       //////////////////////////////////////////////////////////
       ////I couldn't understand what stop method is doing/////
       /////////////////////////////////////////////////////////
    }

    @Override
    public void addSong(String song) {
        String songToAdd = song.toLowerCase();
        String songToShow = song.substring(0,1).toUpperCase() + song.substring(1);
        if(playList.contains(songToAdd)){
            System.out.println( songToShow + " already exists in the playlist.");
        }
        else{
            this.playList.add(songToAdd);
            System.out.println(songToShow + " added to the playlist.");
        }

    }

    @Override
    public void removeSong(String song) {
        if(!this.playList.isEmpty()){
            String songToRemove = song.toLowerCase();
            String songToShow = song.substring(0,1).toUpperCase() + song.substring(1);
            if (Objects.equals(this.playList.get(currentlyPlaying), songToRemove) && this.isPlaying){
                System.out.println("Can't delete a song you are currently listening.");
            }
            else{
                if (this.playList.contains(songToRemove)){
                    this.playList.remove(songToRemove);
                    System.out.println(songToShow + " is removed from the playlist.");
                }
                else{
                    System.out.println("No song found named " + songToShow + " in the playlist.");
                }
            }

        }
        else{
            System.out.println("playlist is empty, please add some song.");
        }
    }

    public void showPlaylist(){
        if(!this.playList.isEmpty()){
            System.out.println("Your Current PlayList");
            for (int i = 0; i < this.playList.size(); i++) {
                System.out.println(i+1 + ". " + this.playList.get(i));
            }
            System.out.println("Happy Listening!!");
        }
        else{
            System.out.println("playlist looks empty, add some song.");
        }
    }

    public void shufflePlaylist(){
        if(!this.playList.isEmpty()){
            if(this.playList.size() == 1){
                System.out.println("Cannot shuffle, Only one song in the playlist.");
            }
            else{
                String playing = this.playList.get(currentlyPlaying);
                for (int i = this.playList.size()-1; i > 0 ; i--) {
                    double j = Math.floor(Math.random()*(i + 1));
                    int k = (int)j;
                    String selectedSong = this.playList.get(i);
                    this.playList.set(i, this.playList.get(k));
                    this.playList.set(k, selectedSong);
                }
                this.currentlyPlaying = this.playList.indexOf(playing);
                System.out.println("Your playlist is shuffled");

            }
        }
        else{
            System.out.println("playlist is empty, please add some song.");
        }
    }

}
