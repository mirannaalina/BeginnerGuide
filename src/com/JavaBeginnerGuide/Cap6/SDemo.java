package com.JavaBeginnerGuide.Cap6;

public class SDemo {

    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        //each object has its own copy of an instance variable

        ob1.x = 10;
        ob2.y= 20;
        System.out.println(ob1.x + " " + ob2.y);
        System.out.println(ob1.sum() + " " +ob2.getClass());

        StaticDemo.y =19;

        System.out.println(ob1.sum());

    }
}
