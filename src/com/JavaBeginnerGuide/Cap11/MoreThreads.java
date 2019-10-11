package com.JavaBeginnerGuide.Cap11;

public class MoreThreads {

    public static void main(String[] args) {

        MyThread t1 =new MyThread("Child 1");
        MyThread t2 =new MyThread("Child 2");
        MyThread t3 =new MyThread("Child 3");

        //how to see if a thread is finished

        //isAlive()

        //join() -- wait for a thread to finish

    }
}
