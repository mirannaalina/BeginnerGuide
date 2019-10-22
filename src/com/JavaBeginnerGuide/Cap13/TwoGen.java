package com.JavaBeginnerGuide.Cap13;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 =o1;
        ob2 =o2;

        //1.
        // ob1 = new T() you can't instantiate a type parameter
        //T is simply a placeholder
        //the compiler has no way to know what type of obj to create.

        //2.

        //you can't have static methods or variables using T
        //static T getob()     or     static T ob;
    }
}
