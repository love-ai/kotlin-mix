package com.ltz.kotlintest;

public class StringUtil {
    public static String getLastStr(String str) {
        if (str != null && str.length() > 0) {
            return str.charAt(str.length() - 1) + "";
        } else {
            return "";
        }
    }
}
