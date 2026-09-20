package com.example.partygames.home

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
fun HomeScreen(navController: NavController) {
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
        Text( //app name
            text = stringResource(R.string.project_name),
            color = Color.White,
            fontSize = 38.sp,
            fontFamily = chewyFont,
            fontWeight = FontWeight.Normal,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 28.dp, start = 12.dp)

        )
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
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier.padding(top = 120.dp)
            )
            Text(
                text = stringResource(R.string.bored),
                color = Color.White,
                fontSize = 64.sp,
                fontFamily = chewyFont,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = stringResource(R.string.lets),
                color = Color.White,
                fontSize = 64.sp,
                fontFamily = chewyFont,
                fontWeight = FontWeight.Normal
            )
            Button( //play button
                onClick = {navController.navigate(route = Routes.playmenu)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = colorResource(R.color.light_red)
                ),
                shape = RoundedCornerShape(24.dp),
                modifier = Modifier
                    .height(108.dp)
                    .width(200.dp)

            ) {
                Text(
                    text = stringResource(R.string.play),
                    color = colorResource(R.color.crimson),
                    fontSize = 64.sp,
                    fontFamily = antonFont,
                    fontWeight = FontWeight.Normal
                )
            }
                //the play button should lead to the menu yk, game catalog or tournaments and so on
            }
        Text(
            text = stringResource(R.string.or),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Column(

        ) {
            Spacer(
                modifier = Modifier.height(230.dp)
            )
            Button( //settings button
                    onClick = {navController.navigate(route = Routes.settings)},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = colorResource(R.color.light_red)
                    ),
                    shape = RoundedCornerShape(32.dp),
                    modifier = Modifier
                        .height(72.dp)
                        .width(200.dp)

                ) {
                    Text(
                        text = stringResource(R.string.settings),
                        color = colorResource(R.color.crimson),
                        fontSize = 44.sp,
                        fontFamily = chewyFont,
                        fontWeight = FontWeight.Normal
                    )
            }
            Spacer(
                modifier = Modifier.height(24.dp)
            )
            Button( //about devs button
                onClick = {navController.navigate(route = Routes.aboutdevs)},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = colorResource(R.color.light_red)
                ),
                shape = RoundedCornerShape(32.dp),
                modifier = Modifier
                    .height(72.dp)
                    .width(200.dp)

            ) {
                Text(
                    text = stringResource(R.string.about_devs),
                    color = colorResource(R.color.crimson),
                    fontSize = 34.sp,
                    fontFamily = chewyFont,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    PartyGamesTheme {
        HomeScreen(navController = rememberNavController())
    }
}
