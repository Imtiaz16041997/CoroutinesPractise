package com.imtiaz.coroutinespractise

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    fun run(){
        viewModelScope.launch {
            while (true){
                Log.i("One","onCreate: ")
                delay(1000)
            }
        }
    }
}