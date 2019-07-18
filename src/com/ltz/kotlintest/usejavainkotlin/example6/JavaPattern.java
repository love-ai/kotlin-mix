package com.ltz.kotlintest.usejavainkotlin.example6;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaPattern<Animal> {
    public void Test1(JavaPattern<? extends Animal> list) {

    }
    public void Test2(JavaPattern<? super Animal> list) {

    }

    public static void printColl(ArrayList<?> al) {
        Iterator<?> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
