package com.example.user.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Movie {
@NonNull
@PrimaryKey
private String movieId;
private String movieName;

public Movie (){}

public String getMovieId(){
    return movieId;
}

    public void setMovieId(@NonNull String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
