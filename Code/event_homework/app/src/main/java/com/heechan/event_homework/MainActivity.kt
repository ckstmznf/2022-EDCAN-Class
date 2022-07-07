package com.heechan.event_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0;
        findViewById<Button>(R.id.btn_main_button).setOnClickListener {
            count++;

            if(count % 10 == 0){
                Snackbar.make(it, "${count}번 클릭했습니다", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}