package com.example.natripeuvou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.natripeuvou.databinding.ActivityLoginScreenBinding

class Login_Screen : AppCompatActivity() {
    private var binding: ActivityLoginScreenBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        acessaCadastro()
    }

    private fun acessaCadastro() {
        binding?.navegaCadastro?.setOnClickListener {
            startActivity(Intent(this, Register_Screen::class.java))
        }
    }
}