package com.JavaBeginnerGuide.Cap5;

public class Bubble {

    public static void main(String[] args) {


        int nums[] = {99, -10, 100, 16, -987, 433, 2, 1, -98};

        int a, b, t;
        int size;

        size = 9; //nr of elements to sort

        //display the original array
        System.out.println("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + nums[i]);
            System.out.println();
        }

        //bubble sort
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        //display sorted array
        System.out.println("sorted array: ");
        for(int i=0; i<size;i++){
            System.out.println(" "+ nums[i]);
        }



    }
}
