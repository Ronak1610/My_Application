package com.example.myapplication

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.width
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.height
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon


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

                }
            }
        }
    }
}

@Composable
fun BusinessCardApp()
{
    Column(modifier = Modifier

        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color(0xCA5A7933))
        , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter=image,contentDescription = "android logo", alpha = 10f,
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color(0xFF073042))



        )
        Text("Jennifer Doe", fontSize = 40.sp, fontWeight = FontWeight.ExtraLight,color = Color.White, modifier = Modifier.padding(bottom = 10.dp))

        Text("Android Developer Extraordinate",color = Color(0xFF3ddc84), fontWeight = FontWeight.W700)

    }
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .padding(bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {

Column (modifier = Modifier
    .fillMaxWidth()
    .padding(start = 90.dp, end = 10.dp)){
    Row (modifier = Modifier.padding(bottom = 15.dp)){
        val image2 = painterResource(R.drawable.ic_phone)
        androidx.compose.foundation.Image(painter = image2, contentDescription = null,modifier=Modifier.padding(top=1.dp))

        Text("+91 (123) 444 555 66", modifier = Modifier.padding(start=30.dp), fontWeight = FontWeight.W500)

    }
    Row (modifier = Modifier.padding(bottom = 15.dp)){
        val image3= painterResource(id=R.drawable.ic_share)
        androidx.compose.foundation.Image(painter = image3, contentDescription = null ,modifier=Modifier.padding(top=1.dp))
        Text(text = "@Android.Dev", modifier = Modifier.padding(start =30.dp), fontWeight = FontWeight.W500)
    }
    Row (){
        val image4 = painterResource(R.drawable.ic_email)
        androidx.compose.foundation.Image(painter = image4, contentDescription = null,modifier=Modifier.padding(top=1.dp))
        Text(text = "Android1010@gmail.com", modifier = Modifier.padding(start =30.dp), fontWeight = FontWeight.W500)

    }
}
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        BusinessCardApp()

    }
}