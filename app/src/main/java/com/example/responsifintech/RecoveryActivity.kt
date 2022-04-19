package com.example.responsifintech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecoveryActivity : AppCompatActivity() {

    private lateinit var balik_recovery : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        balik_recovery = findViewById(R.id.balikrecovery)

        balik_recovery.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }
    }
}