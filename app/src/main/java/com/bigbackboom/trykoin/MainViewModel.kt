package com.bigbackboom.trykoin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val numberCounter: NumberCounterInterface): ViewModel() {

    var counterLiveData: MutableLiveData<String> = MutableLiveData("0")

    fun onButtonClicked(){
        numberCounter.countUp()
        counterLiveData.postValue(numberCounter.count.toString())
    }
}