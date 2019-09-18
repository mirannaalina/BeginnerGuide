package com.JavaBeginnerGuide.Cap5;

public class ShowBitsDemo {

    public static void main(String[] args) {

        ShowBits byteval = new ShowBits(8);
        ShowBits byteval2 =  new ShowBits(32);
        ShowBits byteval3 =  new ShowBits(64);

        byteval.show(123);
        byteval2.show(87987);
        byteval3.show(222222);
    }


}
