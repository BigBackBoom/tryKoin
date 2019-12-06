package com.bigbackboom.trykoin

class NumberCounter: NumberCounterInterface {

    override var count = 0

    override fun countUp() {
        count++
    }
}