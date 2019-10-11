package com.JavaBeginnerGuide.Cap13;

public class GenericssDemo {

    public static void main(String[] args) {

        //creating a Genericss reference for INTEGERS

        Genericss<Integer> iob;

        //creating a genericss<Integer> obkect and assign its reference to iob

        iob = new Genericss<Integer>(88);

        iob.showType();

        int v = iob.getOb();
        System.out.println("value "+v);

        //===============================================================================

        Genericss<String> strob = new Genericss<String>("Generic test");
        strob.showType();

        String str = strob.getOb();
        System.out.println("value "+str);
    }
}
