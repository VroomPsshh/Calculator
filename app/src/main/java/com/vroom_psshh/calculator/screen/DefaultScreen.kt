package com.vroom_psshh.calculator.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vroom_psshh.calculator.calculation.Calculation
import com.vroom_psshh.calculator.logic.Actions
import com.vroom_psshh.calculator.logic.OperationalMethods

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

    val calculationClass: Calculation = viewModel()
    val state = calculationClass.states

    val numericKeypadColor = 0xFF000000
    val operationKeypadColor = 0xFFEAC14A

    val navigationBarHeight = WindowInsets.navigationBars.asPaddingValues()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(navigationBarHeight)
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
                text = state.number1 + (state.operations?.symbol ?: "") + state.number2,
                fontSize = 55.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Right,
                maxLines = 2
            )

            Card(
                modifier = Modifier
                    .padding(bottom = 12.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF666261))
            )
            {
                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,

                    )
                {
                    //operational button 1st Row
                    Row(
                        modifier = Modifier.fillMaxWidth()
                            .padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            modifier = Modifier.size(80.dp),
                            onClick = { calculationClass.onAction(Actions.Clear)
                            },
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
                            onClick = { calculationClass.onAction(Actions.Delete)},
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEAC14A)
                            )
                        )
                        {
                            Text(text = "⌫", fontSize = 24.sp)
                        }
                        Button(
                            modifier = Modifier.size(80.dp),
                            onClick = {calculationClass.onAction(Actions.Operations(OperationalMethods.Remainder)) },
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
                            onClick = {calculationClass.onAction(Actions.Operations(OperationalMethods.Divide))},
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEAC14A)
                            )
                        )
                        {
                            Text(text = "/", fontSize = 24.sp)
                        }
                    }
                    Row(modifier = Modifier.fillMaxWidth()
                        .height(370.dp)) {
                        //Numerical Row Column container
                        Column(modifier = Modifier
                            .weight(3f)
                        )  {
                            Row (modifier = Modifier.fillMaxWidth()
                                .padding(bottom = 16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically){
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {calculationClass.onAction(Actions.Number(7))},
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
                                    onClick = {calculationClass.onAction(Actions.Number(8))},
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
                                    onClick = {calculationClass.onAction(Actions.Number(9))},
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "9", fontSize = 24.sp)
                                }

                            }
                            Row (modifier = Modifier.fillMaxWidth()
                                .padding(bottom = 16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically){
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {calculationClass.onAction(Actions.Number(4))},
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
                                    onClick = {calculationClass.onAction(Actions.Number(5))
                                    },
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
                                    onClick = { calculationClass.onAction(Actions.Number(6))},
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "6", fontSize = 24.sp)
                                }
                            }
                            Row (modifier = Modifier.fillMaxWidth()
                                .padding(bottom = 16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically) {
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {calculationClass.onAction(Actions.Number(1)) },
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
                                    onClick = {calculationClass.onAction(Actions.Number(2))},
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
                                    onClick = {calculationClass.onAction(Actions.Number(3)) },
                                    shape = CircleShape,
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(numericKeypadColor)
                                    )
                                )
                                {
                                    Text(text = "3", fontSize = 24.sp)
                                }
                            }
                            Row(modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically) {
                                Button(
                                    modifier = Modifier.size(80.dp),
                                    onClick = {calculationClass.onAction(Actions.Number(0)) },
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
                                    onClick = {calculationClass.onAction(Actions.Number(0)) },
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
                                    onClick = {calculationClass.onAction(Actions.Decimals)},
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
                        Column(modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                            verticalArrangement = Arrangement.SpaceBetween) {
                            Button(
                                modifier = Modifier.size(80.dp)
                                    .align(Alignment.End)
                                ,
                                onClick = { calculationClass.onAction(Actions.Operations(OperationalMethods.Multiply))},
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(operationKeypadColor)
                                )
                            )
                            {
                                Text(text = "*", fontSize = 24.sp)
                            }
                            Button(
                                modifier = Modifier.size(80.dp)
                                    .align(Alignment.End),
                                onClick = {calculationClass.onAction(Actions.Operations(OperationalMethods.Subtract))},
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(operationKeypadColor)
                                )
                            )
                            {
                                Text(text = "-", fontSize = 24.sp)
                            }
                            Button(
                                modifier = Modifier.size(80.dp)
                                    .align(Alignment.End),
                                onClick = {calculationClass.onAction(Actions.Operations(OperationalMethods.Add))},
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(operationKeypadColor)
                                )
                            )
                            {
                                Text(text = "+", fontSize = 24.sp)
                            }
                            Button(
                                modifier = Modifier.size(80.dp)
                                    .align(Alignment.End),
                                onClick = {calculationClass.onAction(Actions.Calculate)},
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


