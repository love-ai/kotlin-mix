package com.ltz.kotlintest.usekotlininjava.example1;

public class TestKotlinProperty {
    public static void main(String args[]){
        Student student = new Student();
        System.out.println(student.getFirstName());
        student.setFirstName("xiao ming");
        System.out.println(student.getFirstName());
    }
}
