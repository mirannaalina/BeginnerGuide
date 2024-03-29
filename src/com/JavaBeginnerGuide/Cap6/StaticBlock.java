package com.JavaBeginnerGuide.Cap6;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {  //this block is executed when the class is loaded.
        System.out.println("Inside static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg){
        System.out.println(msg);
    }
}
