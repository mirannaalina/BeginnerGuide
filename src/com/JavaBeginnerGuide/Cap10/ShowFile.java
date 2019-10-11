package com.JavaBeginnerGuide.Cap10;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage: Show File File");
            return;
        }

        try{
            fin = new FileInputStream(args[0]); // open the file
        }catch (FileNotFoundException ex) {
            return;
        }


        try {
            do {
                i = fin.read(); // read from the file
                if (i != -1) System.out.println((char ) i);; //when i = -1 , the end onf the file has been reached
            }while(i != -1);
        } catch (IOException ex) {
            System.out.println("Error reading file");
        }


        try{
            fin.close();  // close the file
        }catch (IOException e){
            System.out.println("Error clossing the file");
        }

    }
}
