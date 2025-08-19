package com.example.aula07

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun Header(modifier: Modifier = Modifier) {
    Surface(
        tonalElevation = 8.dp,
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .height(80.dp)
                .padding(8.dp)
        ) {
            ProfilePic()
            Spacer(Modifier.width(10.dp))
            WelcomeText(
                "Bom te ver, Epaminondas!",
                "Programamador"
            )
        }
    }
}


@Composable
fun ProfilePic() {
    val image: Painter = painterResource(R.drawable.default_pfp)

    Image(
        image,
        contentDescription = "Foto de perfil",
    )
}


@Composable
fun WelcomeText(title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
        Text(
            title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Text(
            subtitle,
            style = MaterialTheme.typography.titleMedium,
        )
    }
}