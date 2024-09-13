package com.vroom_psshh.calculator.logic

sealed class Actions{
    data class Number(val number: Int): Actions()
    object Clear: Actions()
    object Delete: Actions()
    data class Operations(val operation: OperationalMethods): Actions()
    object Calculate: Actions()
    object Decimals: Actions()
}