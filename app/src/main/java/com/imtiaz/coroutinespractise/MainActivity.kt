package com.imtiaz.coroutinespractise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*some points coroutines Builder
        ** launch
        ** async -  The async builder, returns a Deferred<T> object,
        * allowing you to retrieve a value once the coroutine is complete
        ** runBlocking
        *
        *
        * */

        lifecycleScope.launch {
            test2()
        }

    }

    suspend fun test1(){
        val job = lifecycleScope.launch {
            delay(2000)
            Log.i("test","2 sec")

        }
        job.join()
        Log.i("test","test")

    }

    suspend fun test2(){
        val deffered : Deferred<Int> = lifecycleScope.async {
            delay(2000)
            Log.i("test","2 sec")
            10
        }
        val value = deffered.await()

        Log.i("test","test: "+value)

    }


}


/*    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*some points coroutines Builder
        ** launch - launch returns job objects, we can assign it in a variable ,
        * and this variable can tell my current coroutine job happening or not,
        * and with the of this variable we can stop our coroutine also.
        ** async
        ** runBlocking
        *
        *
        * */

        lifecycleScope.launch {
            test()
        }

    }

    suspend fun test(){
        val job = lifecycleScope.launch {
            delay(2000)
            Log.i("test","2 sec")

        }
        job.join()
        Log.i("test","test")

    }


}*/







  /*  private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        *//*Some Points on Scope
        * coroutines has 3 scope
        * GlobalScope - **it has some issue,Leaking Coroutines: Coroutines launched with GlobalScope are
        * not tied to the lifecycle of the application,
        * which means they may continue running even if the application is no longer active.
        * This can lead to resource leaks and unexpected behavior in long-running applications.**
        *
        * after closing the application it still running, so it might be dangerous for leakage
        * we should not use this scope in activity, if we need to use this scope we should use this in application class
        * lifecycleScope - this scope uses in fragment and activity
        * viewModelScope -
        *
        *
        * *//*


        var btn : Button = findViewById(R.id.btn)
        btn?.setOnClickListener {
            startActivity(Intent(this,NextActivity::class.java))
            finish()
        }

        *//*viewModelScope*//*
        viewModel.run()



        *//*GlobalScope *//*
        *//*GlobalScope.launch {
            while (true){
                Log.i("One","onCreate: ")
                delay(1000)
            }
        }*//*

        *//*LifecycleScope*//*
        *//*lifecycleScope.launch {
            while (true){
                Log.i("One","onCreate: ")
                delay(1000)
            }
        }*//*

    }

}
*/






/*
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    */
/*Some Points on Suspend Func
    * Suspend fun call execute in coroutines
    * normal fun also be execute in coroutines
    *
    *
    * *//*


    GlobalScope.launch {
        Log.i("one","start: ")
        networkCall1()
//            networkCall2()
        networkCall3()

        Log.i("one","end: ")
    }

}

suspend fun networkCall1(){
    delay(3000)
    Log.i("one","suspend Function NetworkCall1: ")
    networkCall2()
//        networkCall3()
}

suspend fun networkCall2(){
    delay(3000)
    Log.i("one","suspend Function NetworkCall2: ")
}

fun networkCall3(){

    Log.i("one","Normal Function NetworkCall3: ")
}*/
