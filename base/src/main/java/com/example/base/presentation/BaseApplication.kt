package com.example.base.presentation

import android.app.Application

abstract class BaseApplication : Application() {
    abstract fun getBaseUrl(): String
}