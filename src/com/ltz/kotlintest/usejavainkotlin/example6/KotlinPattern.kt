package com.ltz.kotlintest.usejavainkotlin.example6

import java.util.ArrayList


class KotlinPattern1<Animal> {

    fun Test1(list: KotlinPattern1<out Animal>) {

    }

    fun Test2(list: KotlinPattern1<in Animal>) {

    }

    fun printColl(al: ArrayList<*>) {
        val it = al.iterator()
        while (it.hasNext()) {
            println(it.next().toString())
        }
    }

}


