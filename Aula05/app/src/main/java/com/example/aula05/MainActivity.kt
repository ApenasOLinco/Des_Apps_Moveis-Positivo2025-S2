package com.example.aula05

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.aula05.ui.theme.Aula05Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeiraTela()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrimeiraTela() {
    Scaffold { innerPadding ->
        Surface(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .padding(innerPadding),
            shadowElevation = 6.dp,
            tonalElevation = 6.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Nota("Caguei nas calças", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA")
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Nota(titulo: String, texto: String) {
    Surface {
        Column {
            // Título
            NotaTitulo(titulo)
            // Corpo
            NotaCorpo(texto)
        }
    }
}


@Composable
fun NotaTitulo(texto: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = texto, style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun NotaCorpo(texto: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(start = 5.dp, end = 5.dp)
            .background(Color.Blue)
    ) {
        Text(text = texto)
    }
}
