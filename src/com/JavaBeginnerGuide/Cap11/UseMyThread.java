package com.JavaBeginnerGuide.Cap11;

public class UseMyThread {

    public static void main(String[] args) {

        System.out.println("my thread starting");

        MyThread t = new MyThread("Child 1"); //stie din constructor sa porneasca thread-ul

    }
}
