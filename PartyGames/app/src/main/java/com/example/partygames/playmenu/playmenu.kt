package com.example.partygames.playmenu

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun PlayMenu(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image( //background
            painter = painterResource(R.drawable.main_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Button(
            onClick = {navController.navigate(route = Routes.homescreen)},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = colorResource(R.color.light_red)
            ),
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 28.dp, start = 12.dp)
        ){
            Text(
                text = stringResource(R.string.back_button),
                color = colorResource(R.color.crimson),
                fontSize = 24.sp,
                fontFamily = chewyFont,
                fontWeight = FontWeight.Normal
            )
        }
        Image( //logo
            painter = painterResource(R.drawable.white_swirl),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.TopEnd)
                .padding(top = 24.dp, end = 2.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {/*todo*/},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = colorResource(R.color.light_red)
                ),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .width(240.dp)
                    .height(150.dp)
            ){
                Text(
                    text = stringResource(R.string.game_catalog),
                    color = colorResource(R.color.crimson),
                    fontSize = 34.sp,
                    fontFamily = chewyFont,
                    fontWeight = FontWeight.Normal
                )
            }
            Button(
                onClick = {/*todo*/},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = colorResource(R.color.light_red)
                ),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .padding(top = 24.dp)
                    .width(240.dp)
                    .height(150.dp)
            ){
                Text(
                    text = stringResource(R.string.tournaments),
                    color = colorResource(R.color.crimson),
                    fontSize = 38.sp,
                    fontFamily = chewyFont,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}

@Preview
@Composable
fun PlayMenuPreview() {
    PlayMenu(navController = rememberNavController())
}