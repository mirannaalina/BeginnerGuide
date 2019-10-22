package com.JavaBeginnerGuide.Cap13;

public class Gen<T> {

    T ob;  //declare an object of type T

    //constructor
    Gen(T o){
        ob =o;
    }

    //return ob

    T getOb(){
        return ob;
    }
}
