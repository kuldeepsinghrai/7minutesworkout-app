package com.kuldeepsinghrai.a7minutesworkoutapp

import android.app.Application

class WorkOutApp : Application() {
    val db: HistoryDatabase by lazy {
        HistoryDatabase.getInstance(this)
    }
}