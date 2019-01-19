package com.example.user.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Movie.class,Lesson.class},version = 1,exportSchema = false)
public abstract class MovieDatabase extends RoomDatabase{
    public abstract DaoAccess
    daoAccess();
}
