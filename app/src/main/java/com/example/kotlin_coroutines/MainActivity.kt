package com.example.kotlin_coroutines

import android.content.AbstractThreadedSyncAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        GlobalScope.launch() {
//            //Pauses the current coroutine
//            delay(3000)
//            Log.d(TAG, "Coroutine says hello from ${Thread.currentThread().name}")
//            //Delay time adds up
//            val networkCallAnswer = doNetworkCall()
//            val networkCallAnswer2 = doNetworkCall2()
//        }
//        Log.d(TAG, "Coroutine says hello from ${Thread.currentThread().name}")
//
//    }
//
//    suspend fun doNetworkCall(): String {
//        delay(5000)
//        return "Users"
//    }
//
//    suspend fun doNetworkCall2(): String {
//        delay(5000)
//        return "Images"
//    }
//        GlobalScope.launch(Dispatchers.IO) {
//            val loadImages = loadImages()
//            Log.d(TAG,"Coroutines runs on ${Thread.currentThread().name}")
//            withContext(Dispatchers.Main){
//             val homeText = findViewById<TextView>(R.id.text_1)
//                homeText.text = loadImages
//                Log.d(TAG, "Coroutine runs on:${Thread.currentThread().name}")
//            }
//        }
//        //Demonstrating that run blocking affects only the main thread
//        runBlocking{
//            delay(100)
//            Log.d(TAG,"Coroutine1 runs on ${Thread.currentThread().name}")
//
//            launch(Dispatchers.IO){
//                delay(1000)
//                Log.d(TAG, "Coroutine runs on ${Thread.currentThread().name}")
//            }
//            launch(Dispatchers.IO){
//                delay(1000)
//                Log.d(TAG, "Coroutine runs on ${Thread.currentThread().name}")
//            }
//        }
//    }
//
//    suspend fun loadImages(): String {
//        delay(7000)
//        return "final Destination"
//
//    }
        val job = GlobalScope.launch{
            repeat(5){
                delay(1000)
                Log.d(TAG,"Coroutine is running....")
            }

        }
        runBlocking {
            //join() waits for coroutine to finish executing.
            delay(3000)
            job.cancel()

            Log.d(TAG,"Coroutine has finished running")
        }

    }
}