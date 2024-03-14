package com.example.natripeuvou

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.natripeuvou.databinding.ActivityRegisterScreenBinding

class Register_Screen : AppCompatActivity() {
    private var binding: ActivityRegisterScreenBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding?.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        acessaLogin()
    }

    private fun acessaLogin() {
        binding?.acessaLogin?.setOnClickListener {
            startActivity(Intent(this, Login_Screen::class.java))
        }
    }

}
