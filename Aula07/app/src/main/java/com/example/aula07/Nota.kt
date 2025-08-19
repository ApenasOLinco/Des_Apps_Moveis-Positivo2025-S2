package com.example.aula07

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun Nota() {
    Row {
        Checkmark()
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
