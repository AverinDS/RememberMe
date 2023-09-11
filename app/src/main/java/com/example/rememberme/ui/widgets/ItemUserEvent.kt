package com.example.rememberme.ui.widgets

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rememberme.R
import com.example.rememberme.ui.theme.RememberMeTheme

@Composable
fun ItemUserEvent(name: String, modifier: Modifier = Modifier) {
    Surface(shape = MaterialTheme.shapes.medium) {
        Row(modifier = Modifier.padding(4.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ring_24),
                contentDescription = "It is notification",
                Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.Blue)

            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(Modifier.padding(start = 4.dp, top = 2.dp, end = 4.dp)) {
                Text(
                    text = "Hello $name!", style = MaterialTheme.typography.headlineMedium
                )
                Text(text = "It is second greeting in the component compose!", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }


}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun GreetingPreview() {
    RememberMeTheme {
        ItemUserEvent("Android")
    }
}