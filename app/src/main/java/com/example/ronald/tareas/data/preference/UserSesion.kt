package com.example.ronald.tareas.data.preference

import android.content.Context
import android.content.SharedPreferences
import java.util.prefs.AbstractPreferences

class  UserSesion{

    lateinit var preferences: SharedPreferences
     var  logged:Boolean
      get() = preferences.getBoolean("logged",false)
    set(value) = preferences.edit().putBoolean("logged",value).apply()


    var email:String?
    get() = preferences.getString("email",null)
    set(value) = preferences.edit().putString("email",value).apply()

    fun init(context: Context){
        preferences= context.getSharedPreferences("preference",
            Context.MODE_PRIVATE)
    }

}