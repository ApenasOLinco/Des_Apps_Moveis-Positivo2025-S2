package com.example.aula08

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula08.ui.theme.Aula08Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula08Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TelaInicial(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Preview
@Composable
private fun TelaInicial(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        UserCard()

        Spacer(modifier = Modifier.height(5.dp))

        CampoInput()
    }
}


@Preview
@Composable
private fun UserCard() {
    Surface (
        modifier = Modifier
            .clip(
                shape = RoundedCornerShape(12.dp)
            ),
        tonalElevation = 20.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Person Icon",
                modifier = Modifier.size(64.dp)
            )

            Column {
                Text(
                    text = "Bem-vindo, Epaminondas",
                    style = MaterialTheme.typography.titleLarge,
                )

                Text(
                    text = "Programamador",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
    }
}