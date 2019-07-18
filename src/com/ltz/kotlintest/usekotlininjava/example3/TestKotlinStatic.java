package com.ltz.kotlintest.usekotlininjava.example3;

public class TestKotlinStatic {
    public static void main(String args[]) {
        /**
         * 静态字段
         */
        //@JvmField
        Key.COMPARATOR.compare(new Key(1), new Key(2));

        //lateinit 在 Singleton 类中的 public static 非-final 字段
        Singleton.key = new Key(1);

        //const
        int c = Singleton.SingletonConst;
        int d = KotlinStaticParamKt.MAX;
        int e = C.VERSION;

        /**
         * 静态方法
         */
        Foo.foo(); // 没问题
//        Foo.bar(); // 错误：不是一个静态方法
        Foo.Companion.foo(); // 保留实例方法
        Foo.Companion.bar(); // 唯一的工作方式

        Obj.foo(); // 没问题
//        Obj.bar(); // 错误
        Obj.INSTANCE.bar(); // 没问题，通过单例实例调用
        Obj.INSTANCE.foo(); // 也没问题
    }
}
