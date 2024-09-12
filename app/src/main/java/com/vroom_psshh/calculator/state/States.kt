package com.vroom_psshh.calculator.state

import com.vroom_psshh.calculator.logic.Operations

data class StateHolder(
    val number1 :String = "",
    val number2: String ="",
    val operations: Operations? = null
)