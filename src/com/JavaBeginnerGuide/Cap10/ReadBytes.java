package com.JavaBeginnerGuide.Cap10;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args)throws IOException {

        byte data[] = new byte [10];

        System.out.println("Enter some characters : ");
        System.in.read(data);  //read an array of bytes from keyboard
        System.out.print("You enetered : ");
        for(int i=0;i<data.length;i++){
            System.out.print((char) data[i]);
        }


    }
}
