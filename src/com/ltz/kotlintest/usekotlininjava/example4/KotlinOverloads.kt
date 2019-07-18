package com.ltz.kotlintest.usekotlininjava.example4

class NumberUtil @JvmOverloads constructor(x: Int, y: Double = 0.0) {
    @JvmOverloads
    fun show(a: String, b: Int = 0, c: String = "abc") {
        println("a:$a\nb:$b\nc:$c")
    }
}