package com.JavaBeginnerGuide.Cap5;

public class Queue {
    char q[];

    int putloc, getloc;

    Queue(int size) {  //memroy for queue
        q = new char[size];
        putloc = getloc=0;

    }

    void put (char ch){
        if(putloc==q.length){
            System.out.println("Queue is full");
            return;
        }

        q[putloc++] = ch;
    }

    char get(){
        if(getloc ==putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }

}
