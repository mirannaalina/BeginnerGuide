package com.JavaBeginnerGuide.Cap7;

public class TwoShape {
    private double width;
    private double height;

    TwoShape(double w, double h){
        width =w;
        height=h;
    }

    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }

    void setWidth(double width){
        this.width= width;
    }
    void setHeight(double height){
       this.height = height;
    }

    void showDim(){
        System.out.println("Width and height are: " + width +height);
        System.out.println(width + height + "le aduna aici ");
    }
    static int showDiff(int a , int b){
        int sum = a +b;

        return sum;
    }
}
