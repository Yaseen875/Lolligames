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
import com.example.partygames.R
import com.example.partygames.ui.theme.PartyGamesTheme
import com.example.partygames.ui.theme.antonFont
import com.example.partygames.ui.theme.chewyFont

@Composable
fun HomeScreen() {
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
                .padding(top = 8.dp, start = 12.dp)

        )
        Image(
            painter = painterResource(R.drawable.white_swirl),
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .align(Alignment.TopEnd)
                .padding(top = 2.dp, end = 2.dp)
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
            Button(
                onClick = {/*TODO*/ },
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
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                // do the "or" thing, sitting between two horizontal lines,
                // and below will be setting with gear symbol in shaa allah
                // and also about devs with some icon from flaticon
                //try to use other colors, not just red, maybe another shade of red or idk
                //make the two buttons smaller than the play button
                //the play button should lead to the menu yk, game catalog or tournaments and so on
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    PartyGamesTheme {
        HomeScreen()
    }
}
