package com.JavaBeginnerGuide.Cap11;

public class ThreadCLS implements Runnable {

    //running, ready or blocked

    //Thread Class ( folosesti clasa thread atunci cand ai nevoie de mai multe metode decat run()
    //Runnable Interface (implementeaza doar run()

    //---Thread class has getName() getPriority() isAlive() join() run() sleep() start()

    //---Runnable interface has just run()

    //you can create a thread by instantiating an obj of tyoe Thread


    String thrdName;

    ThreadCLS(String name){
        this.thrdName= name;
    }

    @Override
    public void run() {
        System.out.println(thrdName+ "starting");
        try{
            for(int count =0;count<10;count++){
                Thread.sleep(400);
                System.out.println("In "+ thrdName + " count is " + count );
            }
        }catch (InterruptedException ex){
            System.out.println(thrdName+  "interrupted");
        }
        System.out.println(thrdName+ "terminating" );

    }
}
