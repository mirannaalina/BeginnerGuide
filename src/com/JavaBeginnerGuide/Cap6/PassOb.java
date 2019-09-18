package com.JavaBeginnerGuide.Cap6;

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10,3,2);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(10,3,2);
        System.out.println(ob1.sameBlock(ob2));
        System.out.println(ob1.sameBlock(ob3));
        System.out.println(ob1.sameVolume(ob2));
        System.out.println(ob1.sameVolume(ob3));
    }
}
