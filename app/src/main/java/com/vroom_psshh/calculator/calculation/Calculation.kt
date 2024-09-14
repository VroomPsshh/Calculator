package com.vroom_psshh.calculator.calculation

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.vroom_psshh.calculator.logic.Actions
import com.vroom_psshh.calculator.logic.OperationalMethods
import com.vroom_psshh.calculator.state.StateHolder

class Calculation : ViewModel() {
    var states by mutableStateOf(StateHolder())

    fun onAction(action: Actions) {
        when (action) {
            is Actions.Number -> numberInput(action.number)
            is Actions.Calculate -> calculate()
            is Actions.Operations -> enterOperation(action.operation)
            is Actions.Delete -> delete()
            is Actions.Clear -> states = StateHolder()
            is Actions.Decimals -> applyDecimals()
        }
    }

    private fun numberInput(number: Int) {
        Log.d("Number Input", "$number has been clicked")
        if (states.operations == null) {
            states = states.copy(
                number1 = states.number1 + number

            )
            return
        }
        states = states.copy(
            number2 = states.number2 + number
        )
    }

    private fun calculate() {
        Log.d("Calculate Fun", "Has been called")
        val number1 = states.number1.toDoubleOrNull()
        val number2 = states.number2.toDoubleOrNull()
        if (number1 != null && number2 != null) {
            val result = when (states.operations) {
                is OperationalMethods.Add -> number1 + number2
                is OperationalMethods.Subtract -> number1 - number2
                is OperationalMethods.Multiply -> number1 * number2
                is OperationalMethods.Divide -> number1 / number2
                is OperationalMethods.Remainder -> number1 % number2
                null -> return
            }
            states = states.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operations = null
            )
        }
    }

    private fun enterOperation(operation: OperationalMethods) {
        if (states.number1.isNotBlank()) {
            states = states.copy(operations = operation)
        }
    }

    private fun delete() {
        when {
            states.number2.isNotBlank() -> states =
                states.copy(number2 = states.number2.dropLast(1))

            states.operations != null -> states = states.copy(operations = null)
            states.number1.isNotBlank() -> states =
                states.copy(number1 = states.number1.dropLast(1))
        }
    }

    private fun applyDecimals() {
    }


}