package com.JavaBeginnerGuide.Cap11;

public class UseMain {

    public static void main(String[] args) {

        Thread thrd;

        //getting the main thread
        thrd = Thread.currentThread();

        //display the main thaed's name
        System.out.println("Main thread is called "+ thrd.getName());

        //display the main thread's priority
        System.out.println("Priority " + thrd.getPriority());

        System.out.println();

        //set the name and priority

        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("The main thread is now called "+ thrd.getName());

        System.out.println("Priority is now "+ thrd.getPriority());
    }
}
