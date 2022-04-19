package com.example.responsifintech

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var btn_login : Button
    private lateinit var btn_reset : Button
    private lateinit var btn_register : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login = findViewById(R.id.btnlogin)
        btn_reset = findViewById(R.id.btnreset)
        btn_register = findViewById(R.id.btnregister)

        btn_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }

        btn_reset.setOnClickListener {
            val intent = Intent(this, RecoveryActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }

        btn_register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }
    }


}