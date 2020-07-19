package com.necatisozer.projectname.app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _liveData = MutableLiveData<String>()
    val liveData: LiveData<String> get() = _liveData

    init {
        _liveData.value = "Hello Android!"
    }
}
