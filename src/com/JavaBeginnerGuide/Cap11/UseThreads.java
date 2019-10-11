package com.JavaBeginnerGuide.Cap11;

public class UseThreads {
    public static void main(String[] args) {

        System.out.println("Main thread starting");

        ThreadCLS th = new ThreadCLS("Child #1"); // create a runnable object of my class which implements runnable interface

        Thread newThr = new Thread(th); // construct a thread on that object

        newThr.start(); //start running the thread

    //    for(int i=0;i<50;i++){
    //        System.out.print(".");
    //        try{
    //            Thread.sleep(100);
    //        }catch (InterruptedException ex){
    //            System.out.println("Main thread interrupted.");
    //        }
   //     }

    }
}
