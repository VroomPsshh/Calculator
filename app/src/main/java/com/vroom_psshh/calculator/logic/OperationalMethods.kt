package com.vroom_psshh.calculator.logic

sealed class OperationalMethods(val symbol : String) {
object Add: OperationalMethods("+")
object Subtract: OperationalMethods("-")
object Multiply: OperationalMethods("*")
object Divide: OperationalMethods("/")
object Remainder: OperationalMethods("%")

}