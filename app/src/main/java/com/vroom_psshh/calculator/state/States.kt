package com.vroom_psshh.calculator.state

import com.vroom_psshh.calculator.logic.OperationalMethods

data class StateHolder(
    val number1 :String = "",
    val number2: String ="",
    val operations: OperationalMethods? = null
)