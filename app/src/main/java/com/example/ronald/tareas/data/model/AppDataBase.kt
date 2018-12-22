package com.example.ronald.tareas.data.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import com.example.ronald.tareas.data.dao.TaskDao
import com.example.ronald.tareas.data.database.dao.TaskDao
import com.example.ronald.tareas.data.database.model.Task
import java.sql.Timestamp
import java.util.*

object Convert{
    @TypeConverter
    fun  dateToLong(date:Date):Long = date.time

    @TypeConverter
    fun  longToDate(timestamp:Long):Date =(timestamp)
}

@Database(version = 1,entities = [Task::class])
abstract class AppDataBase:RoomDatabase(){

    abstract fun taskDao():TaskDao


    companion object {
        lateinit var db:AppDataBase

        fun init (context: Context){
            db= Room.databaseBuilder(context,AppDataBase::class.java,"task.db")
                .build()
        }
    }
}