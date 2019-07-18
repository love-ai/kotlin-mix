package com.ltz.kotlintest.usejavainkotlin.example5


fun main(args: Array<String>) {
    val javaObj = JavaArrayMethod()
    val array = intArrayOf(0, 1, 2, 3)
    javaObj.removeIndices(array)  // 将 int[] 传给方法

    array[1] = array[1] * 2 // 不会实际生成对 get() 和 set() 的调用

    for (x in array) {
        println(x)
    }


}