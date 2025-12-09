package com.example.giffa.screen

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.giffa.R

@Composable
fun HomePage3() {
    Box(modifier = Modifier.fillMaxSize()) {
        // پس‌زمینه
        Image(
            painter = painterResource(R.drawable.sd),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        // محتوای اصلی
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ssa),
                    modifier = Modifier.size(350.dp).offset(y = 50.dp),
                    contentDescription = "لوگو گیفتا"
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "ارتباط با خریداران دیگر",
                    fontSize = 30.sp,
                    fontFamily = IranSansFamily,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    maxLines = 1
                )

                Spacer(modifier = Modifier.height(40.dp))

                Text(
                    text = "مزایای این کار چیه؟",
                    fontSize = 22.sp,
                    fontFamily = IranSansFamily,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = stringResource(id = R.string.welcom),
                    fontSize = 16.sp,
                    fontFamily = IranSansFamily,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(30.dp))

                Card(
                    modifier = Modifier
                        .offset(y = 65.dp)
                        .width(350.dp)
                        .height(80.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF184875)
                    ),
                    onClick = { }
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 20.dp)
                    ) {
                        Text(
                            text = "بزن بریم",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontFamily = IranSansFamily,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Card(
                            modifier = Modifier.size(50.dp),
                            shape = RoundedCornerShape(50),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFFDC112)
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.arrow_right),
                                    contentDescription = "فلش",
                                    tint = Color.White,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    name = "HomePage2 Preview",
    widthDp = 440,
    heightDp = 956,
    showBackground = true
)
@Composable
fun HomePagePreview3() {
    HomePage3()

}