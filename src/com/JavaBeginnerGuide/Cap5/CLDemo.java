package com.JavaBeginnerGuide.Cap5;

public class CLDemo {

    public static void main(String[] args) {
        System.out.println("There are" + args.length + " command-line args");
        System.out.println("y are: ");
        for(int i=0; i<args.length;i++){
            System.out.println("arg["+i+"]:"+args[i]);
        }
    }
}
