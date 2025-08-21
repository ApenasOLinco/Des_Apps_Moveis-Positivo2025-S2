package com.example.aula07

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Nota(texto: String) {
    Surface(
        border = BorderStroke(2.dp, color = Color.LightGray),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(3.dp)) {
            Checkmark()
            Text(texto)
        }
    }
}


@Composable
fun Checkmark() {
    var marcado by remember {
        mutableStateOf(false)
    }

    Checkbox(
        checked = marcado,
        onCheckedChange = {
            marcado = it
        },
        enabled = true
    )
}
