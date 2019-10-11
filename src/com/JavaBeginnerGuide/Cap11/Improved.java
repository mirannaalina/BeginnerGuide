package com.JavaBeginnerGuide.Cap11;

public class Improved implements Runnable{

    Thread thrd;

    Improved(String name){
        thrd = new Thread(this ,name); // the thread is named when it is created
        thrd.start(); // being executing the thread
    }

    @Override
    public void run() {

        System.out.println(thrd.getName()+ "starting");
        try{
            for(int count=0;count<=10;count++){
                Thread.sleep(400); //sleep genereaza exceptie
                System.out.println("In " +thrd.getName()+ " count is "+ count);
            }
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
