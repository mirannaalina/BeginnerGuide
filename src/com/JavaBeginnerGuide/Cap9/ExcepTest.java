package com.JavaBeginnerGuide.Cap9;

public class ExcepTest {
    public static void main(String[] args) {

        int nums[] = new int[4];

        try{
            System.out.println("Before ex generated");
            //generate an index out of bound ex
            nums[10] =10; //la indexul 7 ii pasam valoarea 10, dar array-ul nostru este format din 4 valori(0,1,2,3)

            System.out.println("this will not be displayed");

        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
    }
}
