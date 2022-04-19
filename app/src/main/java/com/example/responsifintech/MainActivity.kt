package com.example.responsifintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etemail = findViewById(R.id.etemail) as EditText
        var etpasswd = findViewById(R.id.etpasswd) as EditText
        var btnlogin = findViewById(R.id.btnlogin) as Button
        var btnreset = findViewById(R.id.btnreset) as Button
        var btnregister = findViewById(R.id.btnregister) as Button

    }
}