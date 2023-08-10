package com.example.firstcompose

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            greet("Lokesh")
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun greet(name: String = ""){

//    Text(
//        text = "Hello $name",
//        fontStyle = FontStyle.Italic,
//        fontSize = 30.sp,
//        fontWeight = FontWeight.ExtraBold,
//        textAlign = TextAlign.Center,
//        color = Color.Red
//    )

//    Image(
//        painter = painterResource(id = R.drawable.post3),
//        contentDescription = "Dummy Image",
//        contentScale = ContentScale.Crop
//    )

    Button(
        onClick = { },
        enabled = false
        ) {
        Text(text = "Hello")
        Image(painter = painterResource(id = R.drawable.post3),
            contentDescription = "Hritik"
        )
    }
    }