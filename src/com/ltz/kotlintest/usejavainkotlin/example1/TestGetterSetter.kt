package com.ltz.kotlintest.usejavainkotlin.example1

fun main(args: Array<String>) {
    val myHouse = House("5th Avenue,NY.", 200000.0, true)
    myHouse.price = 300000.0
    myHouse.isNewHouse = false
    println("address:${myHouse.address}\nprice:${myHouse.price}\nisNewHouse:${myHouse.isNewHouse}")
}