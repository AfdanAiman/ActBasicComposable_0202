package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanLoginTugas(modifier: Modifier = Modifier) {

    val bgImage = painterResource(id = R.drawable.hindiaback)
    val logoUmy = painterResource(id = R.drawable.umyclean)
    val fotoBulat = painterResource(id = R.drawable.terbaru)

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = bgImage,
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )


        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(70.dp))

            Text(
                text = "Login",
                fontSize = 40.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = logoUmy,
                contentDescription = "Logo",
                modifier = Modifier.size(130.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "Nama",
                color = Color.Red,
                fontSize = 18.sp
            )
            Text(
                text = "Afdan Aiman Saputra",
                color = Color.Blue,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "20240140202",
                color = Color.Black,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(50.dp))

            Image(
                painter = fotoBulat,
                contentDescription = "FotoBulat",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(250.dp)
                    .clip(CircleShape)
            )
        }
    }
}