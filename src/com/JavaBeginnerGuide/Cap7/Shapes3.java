package com.JavaBeginnerGuide.Cap7;

public class Shapes3 {
    public static void main(String[] args) {
        Triangle t1= new Triangle("filled",4.0,4.0);
        Triangle t2 = new Triangle("outlined",8.0,12.0);

        System.out.println("info for t1");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        t2.showDim();
        t2.showStyle();
        System.out.println("Area is " +t2.area());
    }
}
