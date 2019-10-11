package com.JavaBeginnerGuide.Cap11;

public class MyThread extends Thread{

    //Thread thrd;

    MyThread(String name){
        super(name) ;
        start();
    }

    @Override
    public void run() {

        System.out.println(getName()+ "starting");
        try{
            for(int count=0;count<=10;count++){
                Thread.sleep(400); //sleep genereaza exceptie
                System.out.println("In " +getName()+ " count is "+ count);
            }
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
