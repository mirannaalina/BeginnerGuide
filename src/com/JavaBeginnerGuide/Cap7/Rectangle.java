package com.JavaBeginnerGuide.Cap7;

public class Rectangle extends AbstractShape{


Rectangle(){
    super(); //call superclas default constructor
}
Rectangle(double w, double h){
    super(w,h,"rectangle"); //call superclass constructor
}
double area(){
    return getHeight() *getWidth();
}

}
