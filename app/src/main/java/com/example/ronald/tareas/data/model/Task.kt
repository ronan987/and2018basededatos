package com.example.ronald.tareas.data.model

import android.accounts.AuthenticatorDescription
import androidx.appcompat.widget.DialogTitle
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Task(@PrimaryKey ( )val  id: Long? = null,
           val title: String,
           val description:String,
           val date:Date)