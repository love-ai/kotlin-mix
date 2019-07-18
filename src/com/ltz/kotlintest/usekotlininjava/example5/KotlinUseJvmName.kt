package com.ltz.kotlintest.usekotlininjava.example5

fun List<String>.filterValid(): List<String> {
    return this.filter { it.contains("a") }
}

@JvmName("filterValidInt")
fun List<Int>.filterValid(): List<Int> {
    return this.filter { it > 3 }
}

fun main(args: Array<String>) {
    val arr = arrayListOf(1, 2, 3, 4, 5)
    //不需要区分函数名
    println(arr.filterValid())
}