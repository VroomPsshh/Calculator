package com.vroom_psshh.calculator.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainDesignPreview() {
    MainDesign()
}

@Composable
fun MainDesign() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF66666D))
    )
    {
       Column(modifier = Modifier
           .align(Alignment.BottomCenter)) {

           Text(modifier = Modifier.fillMaxWidth()
               .size(80.dp),
               text = "341", fontSize = 55.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Right)

           Card(
               modifier = Modifier
                   .padding(bottom = 12.dp),
               colors = CardDefaults.cardColors(containerColor = Color(0xFF666261))
           )
           {
               Column(
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(top = 12.dp, bottom = 12.dp),
                   horizontalAlignment = Alignment.CenterHorizontally,

                   ) {
                   RowsInColumn("AC", "%", "X", "/", 0xFFEAC14A)
                   RowsInColumn("7", "8", "9", "*", 0xFF000000)
                   RowsInColumn("4", "5", "6", "-", 0xFF000000)
                   RowsInColumn("1", "2", "3", "+", 0xFF000000)
                   RowsInColumn("00", "0", ".", "=", 0xFF000000)
               }
           }
       }
    }
}

@Composable
fun RowsInColumn(a: String, b: String, c: String, d: String, colorValue: Long) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        RowItems(a = a, b = b, c = c, d = d, colorValue)
    }
}

@Composable
fun RowItems(a: String, b: String, c: String, d: String, colorValue: Long) {
    Button(
        modifier = Modifier.size(80.dp),
        onClick = { /*TODO*/ },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(colorValue)
        )
    )
    {
        Text(text = a, fontSize = 24.sp)
    }
    Button(
        modifier = Modifier.size(80.dp),
        onClick = { /*TODO*/ },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(colorValue)
        )
    )
    {
        Text(text = b, fontSize = 24.sp)
    }
    Button(
        modifier = Modifier.size(80.dp),
        onClick = { /*TODO*/ },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(colorValue)
        )
    )
    {
        Text(text = c, fontSize = 24.sp)
    }
    Button(
        modifier = Modifier.size(80.dp),
        onClick = { /*TODO*/ },
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(colorValue)
        )
    )
    {
        Text(text = d, fontSize = 24.sp)
    }
}
