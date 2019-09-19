package com.JavaBeginnerGuide.Cap7;

public class Triangle extends TwoShape{

    private String style;

    Triangle(String s , double w, double h){
       super(w,h); //call superclass constructor.
        style =s;
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangle is "+ style);
    }

}
