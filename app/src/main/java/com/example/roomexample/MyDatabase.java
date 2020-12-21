package com.example.roomexample;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Customer.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract Dao dao();
}
