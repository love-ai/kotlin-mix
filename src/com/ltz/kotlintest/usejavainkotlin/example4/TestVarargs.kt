package com.ltz.kotlintest.usejavainkotlin.example4

fun main(args: Array<String>) {
    val javaObj = JavaArrayExample()
    val array = intArrayOf(0,1,2,3)
    println(javaObj.removeZero(*array))
    //目前无法传递 null 给一个声明为可变参数的方法。
//    println(javaObj.removeZero(null))
}