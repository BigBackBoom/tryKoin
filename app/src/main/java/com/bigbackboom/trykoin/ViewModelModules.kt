package com.bigbackboom.trykoin

import org.koin.dsl.module

val viewModelModule = module {

    single {
        NumberCounter() as NumberCounterInterface
    }
}