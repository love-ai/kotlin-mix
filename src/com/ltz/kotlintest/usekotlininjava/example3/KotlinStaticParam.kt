package com.ltz.kotlintest.usekotlininjava.example3

class Key(val value: Int) {
    companion object {
        @JvmField //使用 @JvmField 标注这样的属性使其成为与属性本身具有相同可见性的静态字段
        val COMPARATOR: Comparator<Key> = compareBy<Key> { it.value }
    }
}

object Singleton {
     lateinit var key: Key
      const val SingletonConst = 1
}

class C {
    companion object {
        const val VERSION = 9
    }
}
const val MAX = 239