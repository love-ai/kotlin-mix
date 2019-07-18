package com.ltz.kotlintest.usekotlininjava.example5;

import java.util.Arrays;
import java.util.List;

public class TestKotlinMethod {
    public static void main(String args[]) {
        List<String> stringArr = Arrays.asList("abc", "efa", "bde");
        List<Integer> intArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(KotlinUseJvmNameKt.filterValid(stringArr));
        System.out.println(KotlinUseJvmNameKt.filterValidInt(intArr));
    }
}
