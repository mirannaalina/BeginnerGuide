package com.JavaBeginnerGuide.Cap12;

public class Wrap {

    public static void main(String[] args) {

        //transforming an obj in primitive, or a primitive in objects

        Integer iob = new Integer (100); //manuallyy box value 100

        int i= iob.intValue(); //manually unbox the value

        System.out.println(i +" "+iob);

        Integer iobs = 100; //autobox an int

        int y = iobs;//auto-unbox

    }
}
