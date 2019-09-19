package com.JavaBeginnerGuide.Cap6;

public class VarArgs {

    static void vaTest(int ... va){
        System.out.println("Number of args: "+va.length);
        System.out.println("Contents: ");

        for(int i=0; i < va.length;i++){ //it behave like an array
            System.out.println("arg" + i + " : " + va[i]);
            System.out.println();
        }
    }
    static void vaTest3(String ms, int ... v){

    }

    static void vaTEst2(int a, int b, int ... vals){ //varargs parameter must be the last one
        //just only one var args mentioned.
        System.out.println("test : ");
        System.out.println(vals.length);
    }

    static void vaTest(boolean ... bo){
        System.out.println("\n length : " + bo.length);
        for(int i =0; i<bo.length;i++){
            System.out.println(bo[i]);
        }
    }

    public static void main(String[] args) {

        vaTest(10);
        vaTest(1,2,4);
        vaTest(true);
        vaTEst2(2,4,0);
    }
}
