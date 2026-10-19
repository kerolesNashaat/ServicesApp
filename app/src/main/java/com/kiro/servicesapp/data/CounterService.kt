package com.kiro.servicesapp.data

import android.app.Service
import android.content.Intent
import android.os.IBinder

class CounterService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}