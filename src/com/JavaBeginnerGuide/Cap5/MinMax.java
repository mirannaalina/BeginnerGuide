package com.JavaBeginnerGuide.Cap5;

public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        for(int i =0; i<10; i++){
            nums[i] =i;
        }

        min = max =  nums[0];
        for(int i=1;i<10;i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max =nums[i];
        }
        System.out.println("min and max " + min + " " + max);
    }
}
