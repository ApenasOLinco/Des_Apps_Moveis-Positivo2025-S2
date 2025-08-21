 package com.example.aula07

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula07.ui.theme.Aula07Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula07Theme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 30.dp)
                ) {
                    HomeScreen()
                }
            }
        }
    }
}


@Preview
@Composable
fun HomeScreen() {
    Column {
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Header()
        }

        HorizontalDivider(
            thickness = 2.dp,
            modifier = Modifier.padding(12.dp)
        )

        Nota("Dançar tango")
    }

}

@Composable
fun Footer() {

}