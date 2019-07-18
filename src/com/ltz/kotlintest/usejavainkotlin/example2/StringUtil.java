package com.ltz.kotlintest.usejavainkotlin.example2;

import java.util.List;

public class StringUtil {
    private final static String str = "and";

    public static boolean in(List<String> stringList) {
        return stringList.contains(str);
    }
}
