package com.JavaBeginnerGuide.Cap6;

public class QueueQ {
    private char q[];
    private int putloc, getloc;

    QueueQ(int size){
        q =  new char[size];
        putloc = getloc =0;
    }

    void put(char ch){
        if(putloc==q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }
    char get(){
        if(getloc ==putloc){
            System.out.println(" -  Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
