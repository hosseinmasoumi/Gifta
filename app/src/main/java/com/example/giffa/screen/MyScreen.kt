package com.example.giffa.screen

import android.companion.AssociatedDevice
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        // تیتر
        Text(
            text = "سلام دنیا",
            fontFamily = IranSansFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )

        // متن معمولی
        Text(
            text = "این یک متن فارسی است",
            fontFamily = IranSansFamily,
            fontSize = 16.sp
        )

        // متن نازک
        Text(
            text = "متن Light",
            fontFamily = IranSansFamily,
            fontWeight = FontWeight.Light,
            fontSize = 14.sp
        )

        // متن متوسط
        Text(
            text = "متن Medium",
            fontFamily = IranSansFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Associe(){
    MyScreen()
}