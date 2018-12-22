package com.example.ronald.tareas.util

import android.app.Application
import android.view.View
import com.example.ronald.tareas.data.model.AppDataBase
import com.example.ronald.tareas.data.preference.UserSesion

class App:Application(){
     override fun onCreate(){
        super.onCreate()
        AppDataBase.init(this)
         UserSesion.init(this)
    }

}