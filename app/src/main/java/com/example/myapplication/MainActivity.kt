package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("La casa del dragón.","Temporada 2")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, textTwo: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Top,
        /*modifier = modifier.padding(8.dp)*/
        modifier = modifier
        ) {
        Text(
            text = message,
            //fontSize = 100.sp,
            fontSize = 25.sp,
            //lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                //.align(alignment = Alignment.End)
                .fillMaxWidth(),
                textAlign = TextAlign.Justify

        )
        Text(
            text = textTwo,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                //.align(alignment = Alignment.End)
                .fillMaxWidth(),
            textAlign = TextAlign.Justify

        )
    }
}

@Composable
fun GreetingImage(message: String,messageTwo:String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.la_casa_del_dragon_logo_en_fuego_10590)

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp) // Cambia el tamaño de la imagen según tus necesidades
            )

            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto

            Text(
                text = message,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto

            Text(
                text = messageTwo,
                fontSize = 25.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    MyApplicationTheme {
        //GreetingText("Happy Birthday Aarón!", "From Aarón")
        GreetingImage("La casa del dragón.","Temporada 2")
    }
}