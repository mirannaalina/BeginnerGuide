package com.JavaBeginnerGuide.Cap8;

public class SeriesDemo {
    public static void main(String[] args) {

        ByTwos ob =new ByTwos();

        for(int i=0; i<5;i++){
            System.out.println("Next value is "+ ob.getNext());
        }
    }
}
