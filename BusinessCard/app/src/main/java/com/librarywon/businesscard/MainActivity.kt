package com.librarywon.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.librarywon.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.background(Color(0xFFE7FFF0)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CenterProfile()
        Spacer(Modifier.height(150.dp))
        InfoSection()
    }

}

@Composable
fun CenterProfile(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 200.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(Color(0xFF4B5957))
        )
        Text(text = "Jaewon Seo", fontSize = 24.sp)
        Text(text = "Android Developer")
    }
}

@Composable
fun InfoSection(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(30.dp)
    ) {
        CardInfo(
            painter = painterResource(id = R.drawable.ic_phone),
            text = "010-1234-5678"
        )
        CardInfo(
            painter = painterResource(id = R.drawable.ic_share),
            text = "@librarywon"
        )
        CardInfo(
            painter = painterResource(id = R.drawable.ic_mail),
            text = "librarywon@gmail.com"
        )
    }
}

@Composable
fun CardInfo(painter: Painter, text: String, modifier: Modifier = Modifier) {
    Row(modifier = Modifier.padding(6.dp)) {
        Icon(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.padding(end = 6.dp)
        )
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        InfoSection()
    }
}