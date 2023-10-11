package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.concurrent.thread

private const val TAG = "DebuggingActivity"
class DebuggingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debugging)
        Log.d(TAG, "this is where the app crashed before")
        val helloTextView: TextView = findViewById(R.id.division_textview)
        Log.d(TAG,"this should be logged if the bug is fixed")
        helloTextView.text = "Hello, debbugging!"
        logging()
        division()
    }
    private fun division(){
        val numerator = 60
        var denominator = 4
        thread( start = true){
            repeat(4){
                Thread.sleep(3000)
                runOnUiThread {
                    findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
                    denominator--
                }

            }
        }

    }
    fun logging() {
        Log.e (TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "INFO: reporting technical information useful fpr debugging")
        Log.v(TAG, "more verbose than DEBUG logs")
    }
}