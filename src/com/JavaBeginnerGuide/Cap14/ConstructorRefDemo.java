package com.JavaBeginnerGuide.Cap14;

public class ConstructorRefDemo {

    public static void main(String[] args) {

        MyFunc myClassCons = MyClass::new;  //a constructor reference

        MyClass mc = myClassCons.func("testing");

        System.out.println(mc.getStr());
    }
}
