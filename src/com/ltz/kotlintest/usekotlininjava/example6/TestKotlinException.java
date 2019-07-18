package com.ltz.kotlintest.usekotlininjava.example6;

import java.io.IOException;

public class TestKotlinException {
    public static void main(String args[]) {
        try{
            KotlinExceptionKt.textKtException();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
