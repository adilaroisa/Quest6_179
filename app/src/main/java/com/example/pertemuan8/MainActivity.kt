package com.example.pertemuan8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan8.ui.theme.Pertemuan8Theme
import com.example.pertemuan8.view.uicontroller.DataApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan8Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DataApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

