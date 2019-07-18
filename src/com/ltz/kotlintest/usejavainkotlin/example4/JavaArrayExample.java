package com.ltz.kotlintest.usejavainkotlin.example4;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayExample {

//    public static void main(String args[]){
//        System.out.println(removeZero(null));
//    }

    //kotlin中使用varargs
    public List<Integer> removeZero(int... intArr) {
        List<Integer> resultArr = new ArrayList<>();
        for (int value : intArr) {
            if (value != 0) {
                resultArr.add(value);
            }
        }
        return resultArr;
    }

}

