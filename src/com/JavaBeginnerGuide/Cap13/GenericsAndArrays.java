package com.JavaBeginnerGuide.Cap13;

public class GenericsAndArrays<T extends Number> {

    T ob;
    T vals[];

    GenericsAndArrays(T o, T[] nums) {
        ob = o;

        //vals = new T[10]; illegal, can't create an array of T

        vals = nums;
    }
}
