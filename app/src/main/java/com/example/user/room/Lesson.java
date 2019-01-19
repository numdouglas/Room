package com.example.user.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Lesson {
    @NonNull
    private String lessonName;
    private String lessonTime;
    @PrimaryKey
    @NonNull
    private String lessonCode;

    public Lesson(){}

    public String getLessonCode() {
        return lessonCode;
    }

    @NonNull
    public String getLessonName() {
        return lessonName;
    }

    public String getLessonTime() {
        return lessonTime;
    }

    public void setLessonCode(@NonNull String lessonCode) {
        this.lessonCode = lessonCode;
    }

    public void setLessonName( String lessonName) {
        this.lessonName = lessonName;
    }

    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }
}
