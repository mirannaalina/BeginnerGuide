package com.JavaBeginnerGuide.Cap9;

import java.util.ArrayList;
import java.util.List;

public class ThrowEx {
    public static void main(String[] args) {

        int i [] = new int[3];
        List<String > elemente = new ArrayList<>();
        elemente.add("Alina");

        try{
            System.out.println("before");
            throw new ArithmeticException(); //throw an ex

        }catch (Exception e){
            System.out.println("Exception caught");
        }
        System.out.println("after");
    }
}
