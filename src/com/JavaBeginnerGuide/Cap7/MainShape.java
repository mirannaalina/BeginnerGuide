package com.JavaBeginnerGuide.Cap7;

import static com.JavaBeginnerGuide.Cap7.TwoShape.showDiff;

public class MainShape {
    public static void main(String[] args) {

        TwoShape s = new TwoShape(1.0,2.4);

        s.setHeight(1.3);
        System.out.println(s.getHeight());
        s.setWidth(2.4);
        System.out.println(s.getWidth());
        s.showDim();
        System.out.println(showDiff(3,4));
    }
}
