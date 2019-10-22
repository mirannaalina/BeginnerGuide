package com.JavaBeginnerGuide.Cap13;

public class RawDemo {

    public static void main(String[] args) {

        //create gen obj for integers

        Gen<Integer> iOb =new Gen<>(90);

        //create a gen obj of strings

        Gen<String> sOb =new Gen<>("Test");

        //create a raw type gen object and give a double value

        Gen raw = new Gen(new Double(90.8)); //unnecessary boxing

        //cast here is necesary :

        double d =(Double) raw.getOb();

        System.out.println("value" +d);


    }
}
