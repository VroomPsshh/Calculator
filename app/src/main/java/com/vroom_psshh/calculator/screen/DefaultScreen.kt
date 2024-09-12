package com.vroom_psshh.calculator.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vroom_psshh.calculator.logic.Operations

@Preview
@Composable
fun Contents() {
    Container()
}

@Composable
fun Container() {
    DesignContainer()
}

@Composable
fun DesignContainer() {

    val numericKeypadColor = 0xFF000000
    val operationKeypadColor = 0xFFEAC14A
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF66666D))
    )
    {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        ) {

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(80.dp),
                text = "input",
                fontSize = 55.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Right
            )

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

                    )
                {
                    //operational button 1st Row
                    Row {
                        Button(
                            modifier = Modifier.size(80.dp),
                            onClick = { Operations.ALL_CLEAR },
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF3D882C)
                            )
                        )
                        {
                            Text(text = "AC", fontSize = 24.sp)
                        }
                        Button(
                            modifier = Modifier.size(80.dp),
                            onClick = { Operations.REMAINDER},
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEAC14A)
                            )
                        )
                        {
                            Text(text = "%", fontSize = 24.sp)
                        }
                        Button(
                            modifier = Modifier.size(80.dp),
                            onClick = { Operations.SINGLEDLT},
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEAC14A)
                            )
                        )
                        {
                            Text(text = "X", fontSize = 24.sp)
                        }
                        Button(
                            modifier = Modifier.size(80.dp),
                            onClick = { Operations.DIVIDE},
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEAC14A)
                            )
                        )
                        {
                            Text(text = "/", fontSize = 24.sp)
                        }
                    }
                    Row {
                        //Numerical Row Column container
                        Column  {
                            Row {
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "7", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = { },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "8", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = { Operations.NUMERAL},
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "9", fontSize = 24.sp)
                                }

                            }
                            Row {
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "4", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = { Operations.NUMERAL},
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "5", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = { },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "6", fontSize = 24.sp)
                                }
                            }
                            Row {
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "1", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = { Operations.NUMERAL},
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "2", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "3", fontSize = 24.sp)
                                }
                            }
                            Row {
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "00", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "0", fontSize = 24.sp)
                                }
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {Operations.NUMERAL },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = ".", fontSize = 24.sp)
                                }
                            }
                        }

                        //operational last column
                        Column {
                            Button(
                                modifier = Modifier.size(80.dp),
                                onClick = { Operations.MULTIPLY},
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(operationKeypadColor)
                                )
                            )
                            {
                                Text(text = "*", fontSize = 24.sp)
                            }
                            Button(
                                modifier = Modifier.size(80.dp),
                                onClick = { Operations.SUBTRACT},
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(operationKeypadColor)
                                )
                            )
                            {
                                Text(text = "-", fontSize = 24.sp)
                            }
                            Button(
                                modifier = Modifier.size(80.dp),
                                onClick = {Operations.ADD },
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(operationKeypadColor)
                                )
                            )
                            {
                                Text(text = "+", fontSize = 24.sp)
                            }
                            Button(
                                modifier = Modifier.size(80.dp),
                                onClick = { Operations.EQUALS },
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFFFF0000)
                                )
                            )
                            {
                                Text(text = "=", fontSize = 24.sp)
                            }
                        }
                    }
                }
            }
        }
    }

}


