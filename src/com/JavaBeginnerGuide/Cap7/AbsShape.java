package com.JavaBeginnerGuide.Cap7;

public class AbsShape {
    public static void main(String[] args) {
        AbstractShape shapes[] = new AbstractShape[4];

        shapes[0] =new Rectangle(7.0,8.0);
       // shapes[1] =new Triangle("outlined",2.3,4.3);

        System.out.println(shapes[0].area());
    }
}
