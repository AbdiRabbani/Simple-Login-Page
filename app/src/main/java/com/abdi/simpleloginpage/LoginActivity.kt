package com.abdi.simpleloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abdi.simpleloginpage.databinding.ActivityLoginBinding
import com.abdi.simpleloginpage.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding as ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val username = binding.txtUsername
            val userpass = binding.txtPassword

            if (username.text.toString().equals("admin") && userpass.text.toString().equals("admin")) {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(applicationContext, "user or password incorrect!!", Toast.LENGTH_LONG).show()
            }
        }

        binding.signupTxt.setOnClickListener {
            startActivity(Intent(applicationContext, SingupActivity::class.java))
        }

    }
}