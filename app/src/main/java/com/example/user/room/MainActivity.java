package com.example.user.room;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String DATABASE_NAME="movies_db";
    private  MovieDatabase movieDatabase;
    ArrayList<Lesson> mondayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieDatabase=Room.databaseBuilder(getApplicationContext(),MovieDatabase.class,DATABASE_NAME)
     .fallbackToDestructiveMigration().build();


        new Thread(new Runnable() {
            @Override
            public void run() {
                Lesson localList=new Lesson();
               localList.setLessonCode("MMA 401");
                localList.setLessonTime("10");
                localList.setLessonName("Bayes Midid");
                movieDatabase.daoAccess().insertOnlySingleLesson(localList);
                localList.setLessonCode("CCS 523");
                localList.setLessonTime("13");
                localList.setLessonName("Artificial Intelligence");
                movieDatabase.daoAccess().insertOnlySingleLesson(localList);
                localList.setLessonCode("CCS 422");
                localList.setLessonTime("18");
                localList.setLessonName("Laser Technology");
                movieDatabase.daoAccess().insertOnlySingleLesson(localList);
                Log.d("INSERTED",movieDatabase.daoAccess().fetchLessonbyTime(10).getLessonName());
            }
        }).start();

    }}
