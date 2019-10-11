package com.JavaBeginnerGuide.Cap7;

abstract class AbstractShape {
    private double width;
    private double height;
    private String name;

    AbstractShape(){

        width= height =0.0;
        name = "none";
    }

    AbstractShape(double w,double h, String n){
        width=w;
        height=h;
        name=n;
    }
    AbstractShape(double x, String n){
        width=height=x;
        name=n;
    }
    AbstractShape(AbstractShape ob){
        width=ob.width;
        height=ob.height;
        name = ob.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void showDim(){
        System.out.println("Width and height are " + width+" and " + height );
    }

    abstract double area(); // astract method.

}
