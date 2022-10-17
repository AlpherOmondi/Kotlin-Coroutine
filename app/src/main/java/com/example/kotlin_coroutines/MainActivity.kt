package com.example.kotlin_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch {
            //Pauses the current coroutine
            delay(3000)
            Log.d(TAG, "Coroutine says hello from ${Thread.currentThread().name}")
            val networkCallAnswer = doNetworkCall()
            val networkCallAnswer2 = doNetworkCall2()
        }
        Log.d(TAG, "Coroutine says hello from ${Thread.currentThread().name}")

    }
    suspend fun doNetworkCall():String{
        delay(5000)
        return "Users"
    }
    suspend fun doNetworkCall2():String{
        delay(5000)
        return "Images"
    }
}