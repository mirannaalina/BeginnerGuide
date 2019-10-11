package com.JavaBeginnerGuide.Cap13;

public class Genericss<T> {
    //generics means parameterized types
    //you can define an algorithm once, independenlty of any specific type of data

    T ob; //declare an object of type T

    Genericss(T o){
        ob =o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is" + ob.getClass().getName());
    }
}
