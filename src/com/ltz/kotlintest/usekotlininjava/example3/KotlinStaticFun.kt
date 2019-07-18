package com.ltz.kotlintest.usekotlininjava.example3

class Foo {
    //伴生对象
    companion object {
        @JvmStatic fun foo() {}
        fun bar() {}
    }
}

//命名对象
object Obj {
    @JvmStatic fun foo() {}
    fun bar() {}
}