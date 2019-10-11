package com.JavaBeginnerGuide.Cap13;

public class SimpGenericss {

    public static void main(String[] args) {


        TwoGenericss<Integer, String> tgObj = new TwoGenericss<>(88,"Generics");

        //show the types

        tgObj.ShowTypes();

        //obtain and show values.

        int v = tgObj.getob1();
        String str = tgObj.getob2();
        System.out.println(v);
        System.out.println(str);
    }
}
