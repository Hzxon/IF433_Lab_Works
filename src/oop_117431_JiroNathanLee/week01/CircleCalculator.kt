package oop_117431_JiroNathanLee.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14

    var area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    println(checkSize(area))
}

fun checkSize(area: Double): String = if (area > 100) "This is a Big Circle" else "This is a Small Cricle"