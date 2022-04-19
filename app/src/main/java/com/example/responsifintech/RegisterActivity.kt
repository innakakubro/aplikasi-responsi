package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    private lateinit var balik_register : Button
    private lateinit var btn_regakun : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        balik_register = findViewById(R.id.balikregister)
        btn_regakun = findViewById(R.id.btnregakun)

        balik_register.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }

        btn_regakun.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }

    }
}