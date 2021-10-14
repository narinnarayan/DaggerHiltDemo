package com.mobiotics.daggerhiltdemo.ui.mainactivity

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class MainRepository @Inject constructor(@ApplicationContext context: Context) {

    private val names = arrayListOf("Narnia", "GREENISH" , "NASHIK" , "RATTAN")

    fun getNames():ArrayList<String>{
        return names
    }

}