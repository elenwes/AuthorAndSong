package com.company;

import java.util.ArrayList;

public class Playlist {
    ArrayList<Song> songlist = new ArrayList<>();

    public void addSong(Song song){
        songlist.add(song);
    }

    //public String playAllSong(){}

}
