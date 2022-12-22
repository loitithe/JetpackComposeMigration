package com.example.jetpackcomposemigration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloView = findViewById<ComposeView>(R.id.hello)
        helloView.setContent {
            Hello()
        }
    }
}

@Composable
private fun Hello() {
    Text("Hello jetpack")
}