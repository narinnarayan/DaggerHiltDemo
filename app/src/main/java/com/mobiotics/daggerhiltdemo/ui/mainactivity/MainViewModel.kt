package com.mobiotics.daggerhiltdemo.ui.mainactivity

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(@ApplicationContext context: Context, private var mainRepository: MainRepository) : ViewModel(){
    private var names = MutableLiveData<ArrayList<String>>()

    fun getNames():MutableLiveData<ArrayList<String>>{
        names.value = mainRepository.getNames()
       return names
    }



}