package com.example.partygames.aboutdevs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.partygames.R
import com.example.partygames.Routes
import com.example.partygames.ui.theme.PartyGamesTheme
import com.example.partygames.ui.theme.antonFont
import com.example.partygames.ui.theme.chewyFont

@Composable
fun AboutDevs(){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Image( //background
            painter = painterResource(R.drawable.main_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Image(
                    painter = painterResource(R.drawable.whitething),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(100.dp)
                )
                Text(
                    fontSize = 32.sp,
                    text = stringResource(R.string.yusuf),
                    color = Color.White

                )
            }
        }
    }
}

@Preview
@Composable
fun AboutDevsPreview() {
    AboutDevs()
}