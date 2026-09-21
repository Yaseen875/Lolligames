package com.example.partygames.contactus

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
fun ContactUs(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image( //background
            painter = painterResource(R.drawable.main_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Button(
            onClick = { navController.navigate(route = Routes.homescreen) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = colorResource(R.color.light_red)
            ),
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 28.dp, start = 12.dp)
        ) {
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
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier.height(80.dp)
            )
            Row() {
                Text(
                    text = stringResource(R.string.the),
                    color = colorResource(R.color.pink),
                    fontSize = 64.sp,
                    fontFamily = FontFamily.Cursive
                )
                Spacer(
                    modifier = Modifier.width(12.dp)
                )
                Text(
                    text = stringResource(R.string.lollidevs),
                    color = colorResource(R.color.pink),
                    fontSize = 64.sp,
                    fontFamily = chewyFont,
                    fontWeight = FontWeight.Normal
                )
            }
            Row( //Yusuf's about
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        fontSize = 42.sp,
                        text = stringResource(R.string.yusuf_name),
                        color = colorResource(R.color.crimson),
                        fontFamily = antonFont,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = stringResource(R.string.yusuf_about),
                        color = colorResource(R.color.light_red),
                        fontSize = 18.sp,
                        fontFamily = antonFont,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Row( //Yaseen's about
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text(
                        text = stringResource(R.string.yaseen_name),
                        fontSize = 40.sp,
                        color = colorResource(R.color.crimson),
                        fontFamily = antonFont,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = stringResource(R.string.yaseen_about),
                        color = colorResource(R.color.light_red),
                        fontSize = 18.sp,
                        fontFamily = antonFont,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.offset(x = 28.dp)
                    )
                }
            }
            Row( //Essa's about
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(16.dp))
            ) {
                Column() {
                    Text(
                        fontSize = 42.sp,
                        text = stringResource(R.string.essa_name),
                        color = colorResource(R.color.crimson),
                        fontFamily = antonFont,
                        fontWeight = FontWeight.Normal
                    )
                    Text(
                        text = stringResource(R.string.essa_about),
                        color = colorResource(R.color.light_red),
                        fontSize = 18.sp,
                        fontFamily = antonFont,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.offset(x = 12.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ContactUsPreview(){
    ContactUs(navController = rememberNavController())
}