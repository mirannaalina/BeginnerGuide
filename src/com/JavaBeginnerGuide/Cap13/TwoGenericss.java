package com.JavaBeginnerGuide.Cap13;

public class TwoGenericss<T, V> {

    T ob1;
    V ob2;

    TwoGenericss(T ob1 , V ob2){
        this.ob1=ob1;
        this.ob2=ob2;
    }

    void ShowTypes(){
        System.out.println("Type of T is "+ob1.getClass().getName());
        System.out.println("Type of V is "+ob2.getClass().getName());
    }

    T getob1(){
        return ob1;
    }

    V getob2(){
        return ob2;
    }
}
