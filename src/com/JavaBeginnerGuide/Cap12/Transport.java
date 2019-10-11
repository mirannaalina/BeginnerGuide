package com.JavaBeginnerGuide.Cap12;


public enum Transport {
    CAR(2), TRUCK(4), AIRPLANE(5), TRAIN(5), BOAT(9);
    //enum constants
    //self-types

    // Transport tp; //the only values that it can be assignet are those definet by the enum

    // tp = Transport.AIRPLANE;

    //you don;t instantiate an enum using new , but it acts much like other classes

    //---each enum has 2 methods predef values() and valueOf()

    // values() iti returneaza un array de elementele enum-ului

    //each enum constant is an object of its enum type.
    private int speed;

    Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }

    //no inheritance
    //all enums automatically inherit just java.lang.Enum

}
