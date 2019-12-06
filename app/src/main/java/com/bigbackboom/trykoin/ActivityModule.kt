package com.bigbackboom.trykoin

import org.koin.core.qualifier.named
import org.koin.dsl.module

val activityModule = module {
    // MainActivityのスコープ内でMainViewModelを使うことを定義する
    // MainViewModelの依存はget()と記載することで別のモジュールが解決してくれる
    scope(named<MainActivity>()) {
        scoped { MainViewModel(get()) }
    }
}