package com.bigbackboom.trykoin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Koin Android ロガー
            androidLogger()
            //Android Contextを設定する
            androidContext(this@CustomApplication)
            // モジュールを登録する
            modules(listOf(activityModule, viewModelModule))
        }
    }
}