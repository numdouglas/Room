package com.example.user.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DaoAccess {
    @Insert
    void insertOnlySingleMovie(Movie movies);

    @Insert
    void insertMultipleMovies(List<Movie> moviesList);

    @Insert
    void insertOnlySingleLesson(Lesson lesson);
    @Insert
    void insertMultipleLessons(List<Lesson> lessonList);

    @Query("SELECT * FROM Movie WHERE movieId= :movieId")
    Movie fetchOneMoviesbyMovieId(int movieId);

    @Query("SELECT * FROM Lesson WHERE lessonTime= :time")
    Lesson fetchLessonbyTime(int time);

    @Update
    void  updateMovie(Movie movies);

    @Delete
    void deleteMovie(Movie movies);

    @Update
    void updateLesson(Lesson lesson);

    @Delete
    void deleteLesson(Lesson lesson);

}