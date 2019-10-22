package com.JavaBeginnerGuide.Cap13;

public class GenArrays {

    public static void main(String[] args) {

        Integer n[] ={ 1,2,3,4,5,};

        GenericsAndArrays iOb = new GenericsAndArrays(50,n);

        //Gen<Integer> gens[] = new Gen<Integer>[10];  <--wrong

        //Gen<?> gens[] = new Gen<?>[10];   <--- OK

        //you can reference an array of type T
        // T ar[];

        //but you can't instantiate an array of T
        // ar = new T[10;  //can t create an array of T, it is too generic

        //ageneric class cannot extend Throwable.
    }
}
