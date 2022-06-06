package com.company;

public class Song {
    private String name;
    private Author author;
    private int time;

    public Song() {
    }

    public Song(String name, Author author, int time) {
        this.name = name;
        this.author = author;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String play(){
        return name + " " + author;
    }
}
