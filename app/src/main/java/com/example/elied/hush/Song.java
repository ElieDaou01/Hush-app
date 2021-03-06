package com.example.elied.hush;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Song implements Serializable {

    private long id;
    private String title;
    private String artist;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    private int position;

    public Song(long songID, String songTitle, String songArtist){
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}

}
