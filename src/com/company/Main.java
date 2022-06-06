package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Lana Del Rey");
        Song s1 = new Song("National Anthem", author, 203);
        Song s2 = new Song("Summertime Sadness", author, 230);
        Song s3 = new Song("Diet Mountain Dew", author, 205);
        Song s4 = new Song("High By the Beach", author, 200);
        Playlist playlist = new Playlist();
        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);
        playlist.addSong(s4);

        System.out.println();
    }
}
