package com.example.kotlin_coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        GlobalScope.launch{
            Log.d(TAG, "Coroutine says hello from ${Thread.currentThread().name}")


        }
        Log.d(TAG, "Coroutine says hello from ${Thread.currentThread().name}")
    }
}